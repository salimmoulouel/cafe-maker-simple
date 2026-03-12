package com.learning.app;

public class App 
{
    public static void main( String[] args )
    {
        // MANUAL WIRING (No Autowired yet)
        // This is where things get messy!
        
        // 1. Create independent services
        AccountingService accounting = new AccountingService();
        CoffeeMachine machine = new CoffeeMachine();
        
        // 2. Create services that depend on the above
        Cashier cashier = new Cashier(accounting);
        Barista barista = new Barista("Antonio", machine);
        
        // 3. Create the top-level service that needs everything
        Waiter waiter = new Waiter(barista, cashier);
        
        // 4. Run the application
        waiter.takeOrder("Cappuccino");
    }
}
