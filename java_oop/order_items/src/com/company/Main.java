package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Item item1 = new Item("mocha", 3.00);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 5.00);
        Item item4 = new Item("cappuccino", 6.00);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1.name);
        System.out.println(order1.total);
        System.out.println(order1.addItem(item1));
        order1.items.forEach(item -> {
            System.out.println(item.name);
        });
//        List<Item> itemOrder = Arrays.asList(item2, item3, item4);
//        order4.items.addAll(itemOrder);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.items.forEach(item -> System.out.println(item.name));

        order1.ready = true;

        order4.addItem(item2);
        order4.addItem(item2);

        order2.ready = true;

        order4.items.forEach(item -> System.out.printf(item.name + " -- $%.2f\n", item.price));
    }
}
