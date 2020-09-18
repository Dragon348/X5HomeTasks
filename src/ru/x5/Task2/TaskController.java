package ru.x5.Task2;

public class TaskController {
    private static final String task1 = "Ввести целое число в консоли и вывести на экран\n" +
            "последнюю цифру введенного числа.";
    private static final String task2 = "Ввести целое трехзначное число в консоли и найти\n" +
            "сумму цифр этого трехзначного числа.";
    private static final String task3 = "Ввести целое число в консоли. Если оно является\n" +
            "положительным, то прибавить к нему 1, в противном\n" +
            "случае не изменять его. Вывести полученное число.";
    private static final String task4 = "Ввести целое число в консоли. Если оно является\n" +
            "положительным, то прибавить к нему 1; если\n" +
            "отрицательным, то вычесть из него 2; если нулевым,\n" +
            "то заменить его на 10. Вывести полученное число.";
    private static final String task5 = "Ввести три целых числа с консоли. Вывести на\n" +
            "экран наименьшее из них.";
    private static final String task6 = "Ввести целое число в консоли. Вывести его строку-\n" +
            "описание вида «отрицательное четное число»,\n" +
            "«нулевое число», «положительное нечетное число» и\n" +
            "т. д.";
    private static final String task7 = "Написать программу, вычисляющую стоимость 10\n" +
            "минутного междугороднего разговора в зависимости\n" +
            "от кода города. ( Москва(905) - 4.15руб. Ростов(194) -\n" +
            "1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00\n" +
            "руб. ). Пользователь в консоли должен ввести код\n" +
            "города, а в ответ от программы получить, например,\n" +
            "при вводе кода 905, - «Москва. Стоимость разговора:\n" +
            "41.5»";
    private static final String task8 = "Дан массив целых чисел:\n" +
            "[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного\n" +
            "массива найти и вывести на экран:\n" +
            "- максимальное значение\n" +
            "- сумму положительных элементов\n" +
            "- сумму четных отрицательных элементов\n" +
            "- количество положительных элементов\n" +
            "- среднее арифметическое отрицательных элементов";
    private static final String task9 = "Дан массив целых чисел:\n" +
            "[15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].\n" +
            "Переставить элементы массива в обратном порядке.\n" +
            "Вывести результат в консоль";
    private static final String task10 = "Дан массив целых чисел:\n" +
            "[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить\n" +
            "нули в конец массива. Вывести результат в консоль";

    public static void taskController(Reader reader) {
        String command = "";
        while (true) {
            System.out.println("Введите номер задания (1-10).\nДля запуска всех заданий введите \"all\".\nДля выхода введите \"exit\"");
            command = reader.readString();
            if (command.toLowerCase().equals("exit")) break;
            else if (command.toLowerCase().equals("all")) {
                callTask1(reader);
                callTask2(reader);
                callTask3(reader);
                callTask4(reader);
                callTask5(reader);
                callTask6(reader);
                callTask7(reader);
                callTask8();
                callTask9();
                callTask10();

            } else {
                int taskNumber;
                try {
                    taskNumber = Integer.parseInt(command);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования строки в число. Введено не число:" + e);
                    continue;
                }
                if ((taskNumber < 1) || (taskNumber > 10)) {
                    System.out.println("Введён некорректный номер задания");
                } else {
                    switch (taskNumber) {
                        case 1: {
                            callTask1(reader);
                            break;
                        }
                        case 2: {
                            callTask2(reader);
                            break;
                        }
                        case 3: {
                            callTask3(reader);
                            break;
                        }
                        case 4: {
                            callTask4(reader);
                            break;
                        }
                        case 5: {
                            callTask5(reader);
                            break;
                        }
                        case 6: {
                            callTask6(reader);
                            break;
                        }
                        case 7: {
                            callTask7(reader);
                            break;
                        }
                        case 8: {
                            callTask8();
                            break;
                        }
                        case 9: {
                            callTask9();
                            break;
                        }
                        case 10: {
                            callTask10();
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void callTask1(Reader reader) {
        Task1 task = new Task1();
        System.out.println("Задание:");
        System.out.println(task1);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask2(Reader reader) {
        Task2 task = new Task2();
        System.out.println("Задание:");
        System.out.println(task2);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask3(Reader reader) {
        Task3 task = new Task3();
        System.out.println("Задание:");
        System.out.println(task3);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask4(Reader reader) {
        Task4 task = new Task4();
        System.out.println("Задание:");
        System.out.println(task4);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask5(Reader reader) {
        Task5 task = new Task5();
        System.out.println("Задание:");
        System.out.println(task5);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask6(Reader reader) {
        Task6 task = new Task6();
        System.out.println("Задание:");
        System.out.println(task6);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask7(Reader reader) {
        Task7 task = new Task7();
        System.out.println("Задание:");
        System.out.println(task7);
        System.out.println("Реализация:");
        task.solveTask(reader);
        System.out.println();
    }

    public static void callTask8() {
        Task8 task = new Task8();
        System.out.println("Задание:");
        System.out.println(task8);
        System.out.println("Реализация:");
        task.solveTask();
        System.out.println();
    }

    public static void callTask9() {
        Task9 task = new Task9();
        System.out.println("Задание:");
        System.out.println(task9);
        System.out.println("Реализация:");
        task.solveTask();
        System.out.println();
    }

    public static void callTask10() {
        Task10 task = new Task10();
        System.out.println("Задание:");
        System.out.println(task10);
        System.out.println("Реализация:");
        task.solveTask();
        System.out.println();
    }
}
