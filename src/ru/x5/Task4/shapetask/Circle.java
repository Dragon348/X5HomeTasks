package ru.x5.Task4.shapetask;

public class Circle implements Shape {
    private int radius;
    final static double pi = 3.1415d;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square() {
        return pi * radius * radius;
    }


}
