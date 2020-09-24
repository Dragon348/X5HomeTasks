package ru.x5.Task4.CarTask;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String mark, String carClass, Double weight, Engine motor, int maxSpeed) {
        super(mark, carClass, weight, motor);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Предельная скорость: " + maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
