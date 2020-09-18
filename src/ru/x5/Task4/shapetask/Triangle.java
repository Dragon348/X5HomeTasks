package ru.x5.Task4.shapetask;

public class Triangle implements Shape {
    private int height;
    private int side;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    public double square() {
        return 0.5 * height * side;
    }
}
