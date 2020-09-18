package ru.x5.Task2;

/*
Ввести целое число в консоли и вывести на экран
последнюю цифру введенного числа.
*/
public class Task1 {
    public void printLastDigit(int number) {
        System.out.println(number % 10);
    }

    public void solveTask(Reader reader) {
        System.out.print("Введите целое число:");
        printLastDigit(reader.readInt());
    }
}
