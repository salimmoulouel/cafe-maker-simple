package com.learning.app;

import org.springframework.stereotype.Component;

@Component
public class AccountingService {
    private double totalRevenue = 0;

    public void recordSale(double amount) {
        totalRevenue += amount;
        System.out.println("Accounting: Recorded sale of $" + amount + ". Total revenue: $" + totalRevenue);
    }
}
