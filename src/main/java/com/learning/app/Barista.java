package com.learning.app;

public class Barista {
    private String name;
    private CoffeeMachine coffeeMachine;
    /**
     * @deprecated Use Barista(Profile profile, CoffeeMachine machine) instead.
    */
    @Deprecated(since = "2.0", forRemoval = true)
    public Barista(String name, CoffeeMachine machine) {
        this.name = name;
        this.coffeeMachine = machine;
    }

    public String prepare(String type) {
        System.out.println("Barista " + this.name + " is grinding beans...");
        coffeeMachine.brew(type);
        return "A hot " + type + " is ready!";
    }
    @Override
    public String toString() {
        return "Barista: " + this.name;
    }
}
