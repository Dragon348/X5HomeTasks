package ru.x5.Task2;

/*
Ввести три целых числа с консоли. Вывести на
экран наименьшее из них.
*/
public class Task5 {
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void printMinOfThree(int[] arr) {
        System.out.println(min(arr));
    }

    public void solveTask(Reader reader) {
        System.out.println("Введите три целых числа. Каждое число с новой строки: ");
        int[] arr = reader.readInts(3);
        printMinOfThree(arr);
    }
}
