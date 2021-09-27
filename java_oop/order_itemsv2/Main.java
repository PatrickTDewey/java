// package com.company;


public class Main {

    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
        Item item1 = new Item("mocha", 3.00);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 5.00);
        Item item4 = new Item("cappuccino", 6.00);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1.getName());



        // add menu item
        kiosk.addMenuItem(item1.getName(), item1.getPrice());
        kiosk.addMenuItem("Churro", 3.20);
        System.out.println(kiosk.getMenu().get(1));
        kiosk.displayMenu();
        // kiosk.newOrder();
        System.out.println(kiosk.addItemByInput());


    }
}
