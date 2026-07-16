package org.acme.store;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    @GET
    public List<Product> list() {
        return Product.listAll();
    }

    @GET
    @Path("/{id}")
    public Product get(@PathParam("id") Long id) {
        Product product = Product.findById(id);
        if (product == null) {
            throw new WebApplicationException("Product not found", 404);
        }
        return product;
    }

    @POST
    @Transactional
    public Response create(@Valid Product product) {
        product.persist();
        return Response.status(Response.Status.CREATED).entity(product).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Product update(@PathParam("id") Long id, @Valid Product update) {
        Product product = Product.findById(id);
        if (product == null) {
            throw new WebApplicationException("Product not found", 404);
        }
        product.name = update.name;
        product.description = update.description;
        product.price = update.price;
        product.stock = update.stock;
        return product;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        Product product = Product.findById(id);
        if (product == null) {
            throw new WebApplicationException("Product not found", 404);
        }
        product.delete();
        return Response.noContent().build();
    }
}
