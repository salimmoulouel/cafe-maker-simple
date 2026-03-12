package com.learning.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * This method runs automatically after the Spring Context is loaded.
     * We ask Spring to give us the 'waiter' it has already created and wired!
     */
    @Bean
    public CommandLineRunner run(Waiter waiter) {
        return args -> {
            System.out.println("--- SPRING BOOT APPLICATION STARTED ---");
            waiter.takeOrder("Cappuccino");
            System.out.println("---------------------------------------");
        };
    }
}
