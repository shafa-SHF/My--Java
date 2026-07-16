package org.acme.store;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItem extends PanacheEntity {

    @ManyToOne
    public Product product;

    public int quantity;

    public CartItem() {
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double lineTotal() {
        return product.price * quantity;
    }
}
