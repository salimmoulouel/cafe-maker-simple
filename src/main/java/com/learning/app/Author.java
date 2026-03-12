package com.learning.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation to track who wrote each class.
 */
@Retention(RetentionPolicy.RUNTIME) // Important: Make it visible at runtime!
@Target(ElementType.TYPE)           // This can only be applied to Classes (Types).
public @interface Author {
    String name() default "Unknown";
    String date() default "2026-03-12";
}
