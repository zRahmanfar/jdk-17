package org.azma.sealed;

public sealed abstract class Shape  permits Circle, Rectangle, Triangle {

    public abstract double getArea();
    public abstract double getPerimeter();
    public String getType() {
        return this.getClass().getSimpleName();
    }
}

