package ru.x5.Task5.pctask;

public class CPU {
    private double frequency;
    private double coreCount;
    private double cache;
    private String model;
    private String producer;

    public CPU(String producer, double frequency, double coreCount, double cache, String model) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.cache = cache;
        this.model = model;
        this.producer = producer;
    }

    public double getFrequency() {
        return frequency;
    }

    public double getCoreCount() {
        return coreCount;
    }

    public double getCache() {
        return cache;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Процессор:\n"
                + "Производитель: " + getProducer() + "\n"
                + "Модель: " + getModel() + "\n"
                + "Тактовая частота: " + getFrequency() + "\n"
                + "Количество ядер: " + getCoreCount() + "\n"
                + "Кэш пямять: " + getCache() + "\n";
    }
}
