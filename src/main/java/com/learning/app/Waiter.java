package com.learning.app;

import org.springframework.stereotype.Component;

@Component
@Author(name = "Salim", date = "2026-03-12")
public class Waiter {
    private Barista barista;
    private Cashier cashier;

    public Waiter(Barista barista, Cashier cashier) {
        this.barista = barista;
        this.cashier = cashier;
    }

    public void takeOrder(String order) {
        System.out.println("Waiter: Taking order for " + order);
        cashier.processPayment(order);
        String result = this.barista.prepare(order);
        System.out.println("Waiter: Serving " + result);
    }
}
