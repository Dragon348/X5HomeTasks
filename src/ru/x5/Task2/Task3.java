package ru.x5.Task2;

/*
Ввести целое число в консоли. Если оно является
положительным, то прибавить к нему 1, в противном
случае не изменять его. Вывести полученное число.
*/
public class Task3 {
    public void printNewNumber(int number) {
        if (number > 0) number++;
        System.out.println("Обработанное число: " + number);
    }

    public void solveTask(Reader reader) {
        System.out.print("Введите целое число: ");
        printNewNumber(reader.readInt());
    }
}
