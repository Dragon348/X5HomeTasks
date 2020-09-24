package ru.x5.Task7.controllers;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;

import java.io.IOException;
import java.util.Scanner;

public class InputController {
    AccountServiceController accountServiceController;

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файлового хранилища");
        String command = scanner.nextLine();
        try {
            accountServiceController = new AccountServiceController(command);
        } catch (IOException e) {
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
        try {
            accountServiceController.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
