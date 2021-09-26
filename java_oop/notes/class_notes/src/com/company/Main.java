package com.company;

public class Main {

    public static void main(String[] args) {
        Car client1Car = new Car(1993, "honda", "civic", "yellow");
        Car client2Car = new Car(1993, "honda", "civic", "yellow");
        client2Car.year = 2018;
        client2Car.model = "Ford";
        client2Car.color = "black";
        System.out.println(client1Car.year);
    }
}
