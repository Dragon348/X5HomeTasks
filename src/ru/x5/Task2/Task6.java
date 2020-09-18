package ru.x5.Task2;

/*
Ввести целое число в консоли. Вывести его строку-
описание вида «отрицательное четное число»,
«нулевое число», «положительное нечетное число» и
т. д.
*/
public class Task6 {
    public void printDescription(int number) {
        if (number == 0) {
            System.out.println("нулевое число");
        }
        else {
            if (number > 0) {
                System.out.print("положительное ");
            }
            else {
                System.out.print("отрицательное ");
            }
            if (number % 2 == 0) {
                System.out.print("четное ");
            }
            else {
                System.out.print("нечетное ");
            }
            System.out.println("число");
        }
    }

    public void solveTask(Reader reader) {
        System.out.print("Введите целое число: ");
        printDescription(reader.readInt());
    }
}
