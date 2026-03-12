package com.learning.app;

public class Barista {
    private String name;
    private CoffeeMachine coffeeMachine;

    public Barista(String name, CoffeeMachine machine) {
        this.name = name;
        this.coffeeMachine = machine;
    }

    public String prepare(String type) {
        System.out.println("Barista " + this.name + " is grinding beans...");
        coffeeMachine.brew(type);
        return "A hot " + type + " is ready!";
    }
}
