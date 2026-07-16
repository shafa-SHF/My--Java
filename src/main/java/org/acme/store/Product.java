package org.acme.store;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Product extends PanacheEntity {

    @NotBlank(message = "Product name is required")
    public String name;

    public String description;

    @Positive(message = "Price must be positive")
    public double price;

    public int stock;

    public Product() {
    }

    public Product(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
}
