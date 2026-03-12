package com.learning.app;

import org.springframework.stereotype.Component;

@Component
public class CoffeeMachine {
    public void brew(String type) {
        System.out.println("CoffeeMachine: Brewing a perfect " + type + "...");
    }
}
