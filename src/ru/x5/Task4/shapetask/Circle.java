package ru.x5.Task4.shapetask;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * radius * radius;
    }


}
