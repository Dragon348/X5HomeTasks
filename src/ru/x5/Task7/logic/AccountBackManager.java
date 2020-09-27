package ru.x5.Task7.logic;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;

import java.util.ArrayList;


public class AccountBackManager {

    public Account withdraw(Account currentAccount, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (currentAccount == null) {
            throw new UnknownAccountException("Аккаунт не найден");
        } else if (amount > currentAccount.getAmount()) {
            throw new NotEnoughMoneyException("Недостаточно денег на счёте");
        } else {
            currentAccount.setAmount(currentAccount.getAmount() - amount);
            return currentAccount;
        }
    }

    public Account balance(Account currentAccount) throws UnknownAccountException {
        if (currentAccount == null) {
            throw new UnknownAccountException("Аккаунт не найден");
        } else {
            return currentAccount;
        }
    }

    public Account deposit(Account currentAccount, int amount) throws UnknownAccountException {
        if (currentAccount == null) {
            throw new UnknownAccountException("Аккаунт не найден");
        } else {
            currentAccount.setAmount(currentAccount.getAmount() + amount);
            return currentAccount;
        }
    }

    public ArrayList<Account> transfer(Account fromAccount, Account toAccount, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (fromAccount == null) {
            throw new UnknownAccountException("Аккаунт " + fromAccount.getId() + " не найден");
        } else if (toAccount == null) {
            throw new UnknownAccountException("Аккаунт " + toAccount.getId() + " не найден");
        } else if (amount > fromAccount.getAmount()) {
            throw new NotEnoughMoneyException("Недостаточно денег на счёте");
        } else {
            withdraw(fromAccount, amount);
            deposit(toAccount, amount);
            ArrayList<Account> transferMembers = new ArrayList<>();
            transferMembers.add(fromAccount);
            transferMembers.add(toAccount);
            return transferMembers;
        }
    }
}