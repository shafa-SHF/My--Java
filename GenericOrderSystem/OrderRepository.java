package GenericOrderSystem;

import java.util.*;

class OrderRepository<T> {
    private List<T> orders = new ArrayList<>();

    public void add(T order) {
        orders.add(order);
    }

    public List<T> getAll() {
        return orders;
    }
}
