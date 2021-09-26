package com.company;

public class Vehicle {
    private int numberOfWheels;
    private String color;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        System.out.println("Class  name: " + this.getClass().getSimpleName());
        System.out.println(this.color);
        System.out.println(this.numberOfWheels);
        return null;
    }
    public void objectMethods(Vehicle anotherVehicle){
        System.out.println("Class  name: " + this.getClass().getSimpleName());
        System.out.println("toString Method: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherVehicle));
    }
}
