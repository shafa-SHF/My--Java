# Simple Store (Quarkus example)

A minimal store REST API built with Quarkus, Hibernate ORM with Panache, and an
in-memory H2 database. It has two resources:

- **Products** — CRUD catalog of items for sale
- **Cart** — add/remove items, view running total (decrements stock)

## Run it

```bash
./mvnw quarkus:dev
```

The app starts on http://localhost:8080. Sample products are pre-loaded from `import.sql`.

## Try it out

List products:
```bash
curl http://localhost:8080/products
```

Get one product:
```bash
curl http://localhost:8080/products/1
```

Create a product:
```bash
curl -X POST http://localhost:8080/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Water Bottle","description":"1L steel bottle","price":15.0,"stock":40}'
```

Update a product:
```bash
curl -X PUT http://localhost:8080/products/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Coffee Mug","description":"Ceramic mug, 350ml","price":9.00,"stock":95}'
```

Delete a product:
```bash
curl -X DELETE http://localhost:8080/products/1
```

Add an item to the cart:
```bash
curl -X POST http://localhost:8080/cart \
  -H "Content-Type: application/json" \
  -d '{"productId":2,"quantity":3}'
```

View the cart:
```bash
curl http://localhost:8080/cart
```

View cart total:
```bash
curl http://localhost:8080/cart/total
```

Remove a cart item:
```bash
curl -X DELETE http://localhost:8080/cart/1
```

## Project layout

```
src/main/java/org/acme/store/
  Product.java        - Panache entity for products
  CartItem.java        - Panache entity linking a product + quantity
  ProductResource.java - CRUD REST endpoints for products
  CartResource.java    - Add/remove/list/total endpoints for the cart
src/main/resources/
  application.properties - datasource + Hibernate config
  import.sql              - seed data
```

## Next steps you could add
- Order/checkout endpoint that clears the cart and records a purchase
- Categories and search/filtering on products
- Authentication (Quarkus has extensions for OIDC, JWT, basic auth)
- Swap H2 for Postgres via `quarkus-jdbc-postgresql` for production
