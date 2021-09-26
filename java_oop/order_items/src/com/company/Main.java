package com.company;


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

        System.out.println(order1.getName());

        order1.addItem(item1);
        order2.addItem(item3);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.getStatusMessage();

        order1.setReady(true);

        System.out.println(order1);;

        order4.addItem(item2);
        order4.addItem(item2);

        order2.setReady(true);
        System.out.println(item1);


    }
}
