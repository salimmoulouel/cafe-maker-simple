package com.learning.app;

public class App {
    public static void main(String[] args) {
        // 1. Initial Plumbing (Manual Wiring)
        AccountingService accounting = new AccountingService();
        CoffeeMachine machine = new CoffeeMachine();
        Cashier cashier = new Cashier(accounting);
        Barista barista = new Barista("Antonio", machine);
        Waiter waiter = new Waiter(barista, cashier);

        // 2. RUN THE INSPECTOR (The logic that "handles" the annotation)
        System.out.println("--- ANNOTATION INSPECTION ---");
        inspectAuthor(barista);
        inspectAuthor(waiter);
        inspectAuthor(cashier);
        System.out.println("-----------------------------");

        // 3. Regular Logic
        waiter.takeOrder("Cappuccino");
    }

    /**
     * This is the "Annotation Processor". It reads the metadata and acts on it.
     */
    private static void inspectAuthor(Object obj) {
        Class<?> clazz = obj.getClass();
        
        // Use Reflection to check if the class has the @Author annotation
        if (clazz.isAnnotationPresent(Author.class)) {
            // Get the annotation object
            Author authorLabel = clazz.getAnnotation(Author.class);
            System.out.println("SUCCESS: Class '" + clazz.getSimpleName() + "' was written by: " + authorLabel.name() + " on " + authorLabel.date());
        } else {
            System.out.println("WARNING: No @Author found for class: " + clazz.getSimpleName());
        }
    }
}
