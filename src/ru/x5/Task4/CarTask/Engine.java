package ru.x5.Task4.CarTask;

public class Engine {
    private Integer power;
    private String producer;

    public Engine(Integer power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public Integer getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }
}
