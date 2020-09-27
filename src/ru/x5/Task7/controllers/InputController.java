package ru.x5.Task7.controllers;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class InputController {
    private AccountServiceController accountServiceController;
    private String initStatement = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './src/ru/x5/Task8/SQL/Create table'\\;RUNSCRIPT FROM './src/ru/x5/Task8/SQL/Holders'";
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для работы с файловым хранлищем, 2 для работы с БД");
        String command = scanner.nextLine();
        int type = Integer.parseInt(command);
        if (type == 1) {
            System.out.println("Введите имя файлового хранилища");
            command = scanner.nextLine();
        } else {
            command = initStatement;
        }
        try {
            accountServiceController = new AccountServiceController(type, command);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Введите следующую команду:\n" +
                "balance [id] для получения текущего банаса счёта [id]\n" +
                "withdraw [id] [amount] для снятия суммы [amount] со счёта [id]\n" +
                "deposit [i] [amount] для внесения суммы [amount] на счёт [id]\n" +
                "transfer [from] [to] [amount] для перевода суммы [amount] со счёта [from] на счёт [to]\n" +
                "exit для выхода из приложения");
        label:
        while (true) {
            command = scanner.nextLine();
            command = command.replaceAll("\\s+", " ");
            String[] commandParams = command.split(" ");
            switch (commandParams[0].toLowerCase()) {
                case "exit":
                    break label;
                case "balance":
                    try {
                        accountServiceController.balance(Integer.parseInt(commandParams[1]));
                    } catch (UnknownAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case "withdraw":
                    try {
                        accountServiceController.withdraw(Integer.parseInt(commandParams[1]), Integer.parseInt(commandParams[2]));
                    } catch (UnknownAccountException | NotEnoughMoneyException e) {
                        e.printStackTrace();
                    }
                    break;
                case "deposit":
                    try {
                        accountServiceController.deposit(Integer.parseInt(commandParams[1]), Integer.parseInt(commandParams[2]));
                    } catch (UnknownAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case "transfer":
                    try {
                        accountServiceController.transfer(Integer.parseInt(commandParams[1]), Integer.parseInt(commandParams[2]), Integer.parseInt(commandParams[3]));
                    } catch (UnknownAccountException | NotEnoughMoneyException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Команда не опознана");
                    break;
            }
            System.out.println("Введите команду:");
        }
            accountServiceController.close();

    }
}
