package com.learning.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Author(name = "Salim", date = "2026-03-12")
public class Barista {
    private String name;
    private CoffeeMachine coffeeMachine;

    @Autowired
    public Barista(@Value("${cafe.barista.name}") String name, CoffeeMachine machine) {
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
