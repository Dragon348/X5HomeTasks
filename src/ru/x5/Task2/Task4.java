package ru.x5.Task2;

/*
Ввести целое число в консоли. Если оно является
положительным, то прибавить к нему 1; если
отрицательным, то вычесть из него 2; если нулевым,
то заменить его на 10. Вывести полученное число.
*/
public class Task4 {
    public void printNewNumber(int number) {
        if (number > 0) number++;
        else if (number < 0) number -= 2;
        else number = 10;
        System.out.println("Обработанное число: " + number);
    }

    public void solveTask(Reader reader) {
        System.out.print("Введите целое число: ");
        printNewNumber(reader.readInt());
    }
}
