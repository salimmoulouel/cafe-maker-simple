package com.learning.app;

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
