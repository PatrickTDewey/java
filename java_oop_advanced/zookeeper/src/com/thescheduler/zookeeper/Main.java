package com.thescheduler.zookeeper;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mammal mammal = new Mammal();
        Gorilla gorilla = new Gorilla("harambe");
        Bat bat = new Bat();

        System.out.println(gorilla);
        System.out.println(gorilla.throwSomething("banana"));
        System.out.println(gorilla.throwSomething("apple"));
        gorilla.eatBananas();
        System.out.println(gorilla.throwSomething("acorn"));
        gorilla.eatBananas();
        gorilla.climb();

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHuman();
        bat.eatHuman();

        bat.fly();
        bat.fly();

    }
}
