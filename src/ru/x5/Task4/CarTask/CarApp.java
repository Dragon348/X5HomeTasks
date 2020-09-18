package ru.x5.Task4.CarTask;

public class CarApp {
    public static void main(String[] args) {
        Engine engine1 = new Engine(150, "Tesla");
        Engine engine2 = new Engine(270, "Kamaz");

        Car[] cars = new Car[3];
        cars[0] = new Lorry("Камаз", "B", 30.5, engine2, 10);
        cars[1] = new SportCar("Тесла", "S", 30.5, engine1, 320);
        cars[2] = new SportCar("Маруся", "S", 30.5, engine1, 280);

        for (Car car : cars) {
            car.printInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
            System.out.println();
        }
    }
}
