package ru.x5.Task7.views;

import ru.x5.Task7.logic.Account;

public class View {
    public static void printBalance(Account account) {
        System.out.println("Текущий баланс счёта " + account.getId() + ". Держатель " + account.getHolder() + ": " + account.getAmount());
    }

    public static void printDeposite(Account account, int amount) {
        System.out.println("Выполнено пополнение счёта на сумму: " + amount);
        printBalance(account);
    }

    public static void printWithdraw(Account account, int amount) {
        System.out.println("Выполнено снятие со счёта на сумму: " + amount);
        printBalance(account);
    }

    public static void printTransfer(Account from, Account to, int amount) {
        System.out.println("Выполнен перевод со счёта " + from.getId() + " на счёт " + to.getId() + ". Сумма перевода: " + amount);
    }
}
