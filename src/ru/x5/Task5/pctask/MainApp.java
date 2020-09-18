package ru.x5.Task5.pctask;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new ComputerBuilder().addCPU("Intel", "Intel Core i7", 3200, 8, 8)
                .addGPU("NVIDIA", "GDDR5", 2000, CoolerType.ACTIVE)
                .addDisk("SEAGATE", StorageType.HDD, 500, "3.5")
                .addRam("Corsair", "DDR4", 1800, 8)
                .addMonitor("Acer", 24, MatrixType.OLED).build());
        computers.add(new ComputerBuilder().addCPU("AMD", "ATOM", 2400, 2, 4)
                .addGPU("AMD", "GDDR3", 1200, CoolerType.PASSIVE)
                .addMonitor("LG", 18, MatrixType.IPS).build());
        computers.add(new ComputerBuilder().build());

        for (Computer computer : computers) {
            System.out.println(computer);
            System.out.println();
        }
    }
}
