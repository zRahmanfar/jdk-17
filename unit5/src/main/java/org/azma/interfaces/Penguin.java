package org.azma.interfaces;

public class Penguin implements ExampleInterface {

    @Override
    public void abstractMethod() {
        System.out.println("abstract Method" );
    }

    @Override
    public void numberPenguin() {

    }

    @Override
    public void defaultMethod() {
        ExampleInterface.super.defaultMethod();
        ExampleInterface.staticMethod();
    }
    public void printConstants() {
        // Accessing the constants
        System.out.println("Max Users: " + ExampleInterface.MAX_USERS);
        System.out.println("Default Role: " + DEFAULT_ROLE);
        System.out.println("Value of PI: " + PI);
    }
}