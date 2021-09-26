package com.company;

public class Main {

    public static void main(String[] args) {
        // instantiate vehicle class with bike and car instances
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        // use setter for bike number of wheels and color
        bike.setNumberOfWheels(2);
        bike.setColor("red");

        // save bikeWheels to getter of bike wheels & color **
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        // setters
        car.setNumberOfWheels(4);
        car.setColor("green");
        // getters
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        // Print our objects
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
    }
}
