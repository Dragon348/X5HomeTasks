package ru.x5.Task2;

/*
Дан массив целых чисел:
[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
массива найти и вывести на экран:
- максимальное значение
- сумму положительных элементов
- сумму четных отрицательных элементов
- количество положительных элементов
- среднее арифметическое отрицательных элементов
 */
public class Task8 {
    private final int[] arr = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

    public void solveTask() {
        int max = arr[0];
        int positiveSum = 0;
        int negativeEvenSum = 0;
        int positiveCount = 0;
        float negativeAverage = 0;
        int negativeCount = 0;
        int negativeSum = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j > 0) {
                positiveSum += j;
            }
            if ((j < 0) && (j % 2 == 0)) {
                negativeEvenSum += j;
            }
            if (j > 0) {
                positiveCount++;
            }
            if (j < 0) {
                negativeCount++;
                negativeSum += j;
            }
        }
        negativeAverage = (float) negativeSum / negativeCount;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных элементов: " + positiveSum);
        System.out.println("Сумма четных отрицательных элементов: " + negativeEvenSum);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Среднее арифметическое отрицательных элементов: " + negativeAverage);
    }
}
