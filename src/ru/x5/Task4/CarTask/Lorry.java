package ru.x5.Task4.CarTask;

public class Lorry extends Car {
    int maxWeigth;

    public Lorry(String mark, String carClass, Double weight, Engine motor, int maxWeigth) {
        super(mark, carClass, weight, motor);
        this.maxWeigth = maxWeigth;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Предельная скорость: " + maxWeigth);
    }
}
