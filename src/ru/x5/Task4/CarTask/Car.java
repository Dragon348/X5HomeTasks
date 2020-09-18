package ru.x5.Task4.CarTask;

public abstract class Car {
    String mark;
    String carClass;
    Double weight;
    Engine motor;

    public Car(String mark, String carClass, Double weight, Engine motor) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor;
    }

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Марка: " + this.mark);
        System.out.println("Класс авто:" + this.carClass);
        System.out.println("Вес авто:" + this.weight);
        System.out.println("Производитель мотора: " + motor.producer + ". Мощность мотора: " + motor.power);
    }
}
