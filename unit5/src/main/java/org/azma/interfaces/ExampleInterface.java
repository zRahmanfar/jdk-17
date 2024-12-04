package org.azma.interfaces;

public interface ExampleInterface {


    // Static method (implicitly public static final) Membership type --> Class
    int MAX_USERS = 100;  // Defining Public API Constants
    String DEFAULT_ROLE = "Guest";  // Defining Configuration Values
   public static final double PI = 3.14159;  // Defining constants



    // Abstract method (implicitly public and abstract) Membership type --> Instance
    void abstractMethod();
    void numberPenguin();

    // Default method (implicitly public) Membership type --> Instance
    default void defaultMethod() {
        System.out.println("This is a default method.");
        privateMethod();
        privateStaticMethod();
    }

    // Static method (implicitly public ) Membership type --> Class
    static void staticMethod() {
        System.out.println("This is a static method.");
    }


    // private static method Membership type --> Class
    private static void privateStaticMethod() {
        System.out.println("This is private static method.");
    }

    // Private method  Membership type --> Instance
    private void privateMethod() {
        System.out.println("This is a private helper method.");
        privateStaticMethod();
    }
}