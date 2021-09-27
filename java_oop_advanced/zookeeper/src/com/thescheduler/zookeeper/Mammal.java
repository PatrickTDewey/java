package com.thescheduler.zookeeper;

public class Mammal {
    private int energyLevel;

    public Mammal() {
        this.energyLevel = 10;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public int displayEnergyLevel(){
        System.out.println(energyLevel);
        return energyLevel;
    }
    public String toString(){
        return this.getClass().getSimpleName()+"\n"+this.getEnergyLevel();
    }
}
