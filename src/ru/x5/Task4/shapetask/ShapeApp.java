package ru.x5.Task4.shapetask;

public class ShapeApp {

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(5, 2);
        shape[1] = new Circle(7);
        shape[2] = new Rectangle(3, 44);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }

}
