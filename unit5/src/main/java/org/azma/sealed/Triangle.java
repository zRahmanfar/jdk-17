package org.azma.sealed;

// Triangle class
public final class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double[] getSides() {
        return new double[] { a, b, c };
    }
}
