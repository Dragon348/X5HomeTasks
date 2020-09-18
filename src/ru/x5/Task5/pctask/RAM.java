package ru.x5.Task5.pctask;

public class RAM {
    private String producer;
    private double frequency;
    private double memoryVolume;
    private String memoryType;

    public RAM(String producer, String memoryType, double frequency, double memoryVolume) {
        this.producer = producer;
        this.frequency = frequency;
        this.memoryVolume = memoryVolume;
        this.memoryType = memoryType;
    }

    public String getProducer() {
        return producer;
    }

    public double getFrequency() {
        return frequency;
    }

    public double getMemoryVolume() {
        return memoryVolume;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String toString() {
        return "Оперативная память:\n"
                + "Производитель: " + getProducer() + "\n"
                + "Тип памяти: " + getMemoryType() + "\n"
                + "Объём памяти: " + getMemoryVolume() + "\n"
                + "Частота: " + getFrequency() + "\n";
    }
}
