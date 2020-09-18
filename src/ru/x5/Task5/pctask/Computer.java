package ru.x5.Task5.pctask;

public class Computer {
    private CPU cpu;
    private Storage storage;
    private GPU gpu;
    private RAM ram;
    private Monitor monitor;

    public Computer(CPU cpu, Storage storage, GPU gpu, RAM ram, Monitor monitor) {
        this.cpu = cpu;
        this.storage = storage;
        this.gpu = gpu;
        this.ram = ram;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        String str = "Компьютер:\n";
        if (cpu == null) {
            str += "Процессор отсутсвтует\n";
        } else {
            str += cpu;
        }
        if (gpu == null) {
            str += "Видеокарта отсутсвтует\n";
        } else {
            str += gpu;
        }
        if (ram == null) {
            str += "Оперативная память отсутсвтует\n";
        } else {
            str += ram;
        }
        if (storage == null) {
            str += "Накопитель отсутсвтует\n";
        } else {
            str += storage;
        }
        if (monitor == null) {
            str += "Монитор отсутсвтует\n";
        } else {
            str += monitor;
        }
        return str;
    }
}
