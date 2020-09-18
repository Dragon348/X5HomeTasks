package ru.x5.Task5.pctask;

public class GPU {
    private String producer;
    private String memoryType;
    private double memoryVolume;
    private CoolerType coolerType;

    public GPU(String producer, String memoryType, double memoryVolume, CoolerType coolerType) {
        this.producer = producer;
        this.memoryType = memoryType;
        this.memoryVolume = memoryVolume;
        this.coolerType = coolerType;
    }

    public String getProducer() {
        return producer;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public double getMemoryVolume() {
        return memoryVolume;
    }

    public CoolerType getCoolerType() {
        return coolerType;
    }

    @Override
    public String toString() {
        return "Видеокарта:\n"
                + "Производитель: " + getProducer() + "\n"
                + "Тип памяти: " + getMemoryType() + "\n"
                + "Объём памяти: " + getMemoryVolume() + "\n"
                + "Охлаждение: " + getCoolerType() + "\n";
    }
}
