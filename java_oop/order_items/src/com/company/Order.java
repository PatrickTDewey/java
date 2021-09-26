package com.company;

import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<>();
    public Order(String name) {
        this.name = name;
    }
    public double addItem(Item item){
        this.items.add(item);
        this.total += item.price;
        return this.total;
    }
}
