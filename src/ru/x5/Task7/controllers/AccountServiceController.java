package ru.x5.Task7.controllers;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;
import ru.x5.Task7.logic.Account;
import ru.x5.Task7.logic.AccountManager;
import ru.x5.Task7.logic.interfaces.AccountService;
import ru.x5.Task7.views.View;

import java.io.IOException;
import java.util.ArrayList;

public class AccountServiceController implements AccountService {
    AccountManager manager;

    public AccountServiceController(String fileName) throws IOException {
        manager = new AccountManager(fileName);
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        View.printWithdraw(manager.withdraw(accountId, amount), amount);
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        View.printBalance(manager.balance(accountId));
    }

    @Override
    public void deposit(int accountId, int amount) throws UnknownAccountException {
        View.printDeposite(manager.deposit(accountId, amount), amount);
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        ArrayList<Account> transferMembers = manager.transfer(from, to, amount);
        View.printTransfer(transferMembers.get(0), transferMembers.get(1), amount);
    }

    public void close() throws IOException {
        manager.close();
    }

}
