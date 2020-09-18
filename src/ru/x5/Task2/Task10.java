package ru.x5.Task2;

/*
Дан массив целых чисел:
[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
нули в конец массива. Вывести результат в консоль
 */
public class Task10 {
    private int[] arr = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

    public void moveZeros() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    int a = 0;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }

    public void printArr() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void solveTask() {
        moveZeros();
        printArr();
    }
}
