package ru.x5.Task4.shapetask;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double square() {
        return height * width;
    }
}
