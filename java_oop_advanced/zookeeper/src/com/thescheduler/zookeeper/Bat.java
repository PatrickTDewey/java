package com.thescheduler.zookeeper;

public class Bat extends Mammal{
    public Bat(){this.setEnergyLevel(300);}

    public void fly() {
        System.out.println("The bat takes off into the air....*swoosh*");
        this.setEnergyLevel(this.getEnergyLevel() - 50);
        System.out.println(this.getEnergyLevel());
    }

    public void eatHuman() {
        System.out.println("Eating human...gross.");
        this.setEnergyLevel(this.getEnergyLevel()+25);
        System.out.println(this.getEnergyLevel());
    }

    public void attackTown() {
        System.out.println("The town is on fire, the Bat has destroyed everything");
        this.setEnergyLevel(this.getEnergyLevel()-100);
        System.out.println(this.getEnergyLevel());
    }
}

