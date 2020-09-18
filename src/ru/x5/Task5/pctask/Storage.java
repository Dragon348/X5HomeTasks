package ru.x5.Task5.pctask;

public class Storage {
    private StorageType type;
    private String producer;
    private int memoryVolume;
    private String formFactor;

    public Storage(StorageType type, String producer, int memoryVolume, String formFactor) {
        this.type = type;
        this.producer = producer;
        this.memoryVolume = memoryVolume;
        this.formFactor = formFactor;
    }

    public StorageType getType() {
        return type;
    }

    public String getProducer() {
        return producer;
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String toString() {
        return "Хранилище:\n"
                + "Производитель: " + getProducer() + "\n"
                + "Тип накопителя: " + getType() + "\n"
                + "Объём памяти: " + getMemoryVolume() + "\n"
                + "Форм-фактор: " + getFormFactor() + "\n";
    }
}
