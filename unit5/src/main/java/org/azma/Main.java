package org.azma;

import org.azma.enums.Coffee;
import org.azma.records.Person;
import org.azma.sealed.Circle;
import org.azma.sealed.Rectangle;
import org.azma.sealed.Shape;
import org.azma.sealed.Triangle;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;


public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String str1 = "abc";
        System.out.println(str1);
        changeString(str1);
        System.out.println(str1);

//        Man man2 = new Man("ali");
//        System.out.println( man2.hashCode());
//        System.out.println(man2.name);
//        get(man2);
//        System.out.printf(man2.name);

      /*  Man man = new Man("Ali");
        String name = (String) nameHandle.get(man);
        System.out.println("Initial Name: " + name);
        nameHandle.set(man, "Amir");
        boolean updated = nameHandle.compareAndSet(man, "Amir", "Hasan");
        System.out.println("Compare and Set Success: " + updated);
        System.out.println("Name after compare And Set: " + man.name);

        System.out.println(" ************************ ENUMS ************************ ");
        for (var a : Coffee.values()){
            switch (a){
                case LATTE -> {
                    Coffee.LATTE.prepare();
                    a.prepare();
                    System.out.println("valueOf -> " + Coffee.valueOf(a.name()));
                    System.out.println(a.ordinal()+" "+ a.name()+" "+ a.getCode());
                }

                case MOCHA -> {
                    Coffee.MOCHA.prepare();
                    a.prepare();
                    System.out.println("valueOf -> " + Coffee.valueOf(a.name()));
                    System.out.println(a.ordinal()+" "+ a.name()+" "+ a.getCode());
                }
                case ESPRESSO -> {
                    Coffee.ESPRESSO.prepare();
                    a.prepare();
                    System.out.println("valueOf -> " + Coffee.valueOf(a.name()));
                    System.out.println(a.ordinal()+" "+ a.name()+" "+ a.getCode());
                }
                case AMERICANO -> {
                    a.prepare();
                    Coffee.AMERICANO.prepare();
                    System.out.println("valueOf -> " + Coffee.valueOf(a.name()));
                    System.out.println(a.ordinal()+" "+ a.name()+" "+ a.getCode());
                }
            }
        }
        System.out.println(" ************************ Sealed classes ************************ ");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Processing Shapes:");
        System.out.println("Shape: " + circle.getType() + ", Area: " + (circle).getArea());
        System.out.println("Shape: " + rectangle.getType() + ", Area: " + (rectangle).getArea());
        System.out.println("Shape: " + triangle.getType() + ", Area: " + (triangle).getArea());

        System.out.println(" ************************ RECORDS ************************ ");
        Person ali = Person.of("Ali", 30, LocalDate.of(1993, 5, 24));
        System.out.println(ali);
        System.out.println(" ali Years until retirement: " + ali.calculateYearsUntilRetirement());
        ali= Objects.requireNonNull(ali, "record cannot be null");

        Person mina = Person.of("mina", ali.age(), LocalDate.of(1997, 4, 8));
        System.out.println(mina);
        System.out.println(" mina Years until retirement: " + mina.calculateYearsUntilRetirement());
        // Testing validation
        try {
            Person invalidPerson = Person.of("Invalid Person", -1, LocalDate.of(2023, 1, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }*/

    }
    public static Man get(Man man){
        System.out.println(man.hashCode());
        man.name.length();
        man.setName("hasan");
        return man;
    }

    public static void changeString(String str1) {
        System.out.println(str1);
        str1 = "xyz";
    }
}