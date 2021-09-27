package com.thescheduler.zookeeper;

public class Gorilla extends Mammal {
    private final String name;

    public Gorilla(String name) {
        this.name = name;
    }

    public int throwSomething(String item){
        System.out.println(name + " dances around and throws a "+item);
        this.setEnergyLevel(this.getEnergyLevel()-5);
        return this.getEnergyLevel();
    }
    public void eatBananas(){
        System.out.println(name + " grabs a bunch of bananas and eats them.");
        this.setEnergyLevel(this.getEnergyLevel()+10);
        System.out.println(this.getEnergyLevel());
    }
    public void climb(){
        System.out.println(name + " runs up a tree, climbing it with extreme vigor.");
        this.setEnergyLevel(this.getEnergyLevel()-10);
        System.out.println(this.getEnergyLevel());
    }
    public String toString(){
        return this.getClass().getSimpleName()+"\n"+this.getEnergyLevel();
    }
}
