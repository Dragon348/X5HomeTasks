package ru.x5.Task2;

/*
Дан массив целых чисел:
[15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
Переставить элементы массива в обратном порядке.
Вывести результат в консоль
 */
public class Task9 {
    private int[] arr = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

    public void reverseArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
    }

    public void printArr() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void solveTask() {
        reverseArray();
        printArr();
    }
}
