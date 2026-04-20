package GenericOrderSystem;

import java.util.*;

public class Main {

    static double total(List<? extends Order<?, ? extends Number>> list) {
        double sum = 0;
        for (Order<?, ? extends Number> o : list) {
            sum += o.getPrice().doubleValue();
        }
        return sum;
    }

    static Order<?, ? extends Number> max(List<? extends Order<?, ? extends Number>> list) {
        Order<?, ? extends Number> max = list.get(0);

        for (Order<?, ? extends Number> o : list) {
            if (o.getPrice().doubleValue() > max.getPrice().doubleValue()) {
                max = o;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        OrderRepository<Order<Integer, Double>> food = new OrderRepository<>();
        food.add(new Order<>(1, "Food", 10.5));
        food.add(new Order<>(2, "Food", 20.0));

        System.out.println("Food Orders: " + food.getAll());
        System.out.println("Total: " + total(food.getAll()));
        System.out.println("Max: " + max(food.getAll()));

        System.out.println("----------------");

        OrderRepository<Order<String, Integer>> elec = new OrderRepository<>();
        elec.add(new Order<>("E1", "Electronics", 500));
        elec.add(new Order<>("E2", "Electronics", 800));

        System.out.println("Electronic Orders: " + elec.getAll());
        System.out.println("Total: " + total(elec.getAll()));
        System.out.println("Max: " + max(elec.getAll()));
    }
}
