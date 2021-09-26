package com.company;

import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void getStatusMessage() {

        if (this.isReady()) {
            System.out.println("Your order is ready.") ;
        } else {
            System.out.println("Thank you for waiting, your order will be ready soon.");
        }
    }
    public String getOrderTotal(){
        double total = 0;
        for (Item item:
             this.items) {
            total += item.price;
        }
        return String.format("Total: $%.2f", total);
    }
    public String toString(){

        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.name);
        this.items.forEach(item -> System.out.println(item.name + " - " +String.format("$%.2f",item.price)));
        System.out.println(this.getOrderTotal());
        return null;
    }

}
