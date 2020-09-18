package ru.x5.Task5.pctask;

public class ComputerBuilder {
    private CPU cpu;
    private Storage storage;
    private GPU gpu;
    private RAM ram;
    private Monitor monitor;

    public ComputerBuilder addCPU(String producer, String name, double frequency, double coreCount, double cache) {
        this.cpu = new CPU(producer, frequency, coreCount, cache, name);
        return this;
    }

    public ComputerBuilder addDisk(String producer, StorageType type, int memoryVolume, String formFactor) {
        this.storage = new Storage(type, producer, memoryVolume, formFactor);
        return this;
    }

    public ComputerBuilder addGPU(String producer, String memoryType, double memoryVolume, CoolerType coolerType) {
        this.gpu = new GPU(producer, memoryType, memoryVolume, coolerType);
        return this;
    }

    public ComputerBuilder addRam(String producer, String type, double frequency, double volume) {
        this.ram = new RAM(producer, type, frequency, volume);
        return this;
    }

    public ComputerBuilder addMonitor(String producer, double diagonal, MatrixType matrixType) {
        this.monitor = new Monitor(producer, diagonal, matrixType);
        return this;
    }

    public Computer build() {
        return new Computer(cpu, storage, gpu, ram, monitor);
    }
}
