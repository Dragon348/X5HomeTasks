package ru.x5.Task2;

import java.util.Scanner;

public class Reader {
    private final Scanner reader = new Scanner(System.in);

    public int readInt() {
        return reader.nextInt();

    }
    public int[] readInts(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = readInt();
        }
        return arr;

    }
    public String readString() {
        return reader.next();
    }
}
