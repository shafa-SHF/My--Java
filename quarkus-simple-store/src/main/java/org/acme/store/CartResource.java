package org.acme.store;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Map;

@Path("/cart")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CartResource {

    public static class AddItemRequest {
        public Long productId;
        public int quantity;
    }

    @GET
    public List<CartItem> list() {
        return CartItem.listAll();
    }

    @POST
    @Transactional
    public Response addItem(AddItemRequest request) {
        Product product = Product.findById(request.productId);
        if (product == null) {
            throw new WebApplicationException("Product not found", 404);
        }
        if (product.stock < request.quantity) {
            throw new WebApplicationException("Not enough stock", 400);
        }
        product.stock -= request.quantity;
        CartItem item = new CartItem(product, request.quantity);
        item.persist();
        return Response.status(Response.Status.CREATED).entity(item).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response removeItem(@PathParam("id") Long id) {
        CartItem item = CartItem.findById(id);
        if (item == null) {
            throw new WebApplicationException("Cart item not found", 404);
        }
        item.product.stock += item.quantity;
        item.delete();
        return Response.noContent().build();
    }

    @GET
    @Path("/total")
    public Map<String, Double> total() {
        double total = CartItem.<CartItem>listAll().stream()
                .mapToDouble(CartItem::lineTotal)
                .sum();
        return Map.of("total", total);
    }
}
