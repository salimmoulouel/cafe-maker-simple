package com.learning.app;

public class Cashier {
    private AccountingService accountingService;

    public Cashier(AccountingService accountingService) {
        this.accountingService = accountingService;
    }

    public void processPayment(String orderType) {
        double price = 5.0; // Default price
        System.out.println("Cashier: Processing payment for " + orderType);
        accountingService.recordSale(price);
    }
}
