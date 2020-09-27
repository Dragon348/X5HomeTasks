package ru.x5.Task7.controllers;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;
import ru.x5.Task7.logic.Account;
import ru.x5.Task7.logic.AccountBackManager;
import ru.x5.Task7.logic.AccountFileManager;
import ru.x5.Task7.logic.interfaces.AccountManager;
import ru.x5.Task7.logic.interfaces.AccountService;
import ru.x5.Task7.views.View;
import ru.x5.Task8.AccountDBManager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountServiceController implements AccountService {
    AccountManager manager;
    AccountBackManager backManager;

    public AccountServiceController(int type, String initStatement) throws IOException, SQLException {
        switch(type) {
            case 1:
                manager = new AccountFileManager(initStatement);
                break;
            case 2:
                manager = new AccountDBManager(initStatement);
                break;
        }
        backManager = new AccountBackManager();
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        View.printWithdraw(backManager.withdraw(manager.getAccountByID(accountId), amount), amount);
        manager.update();
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        View.printBalance(backManager.balance(manager.getAccountByID(accountId)));
        manager.update();
    }

    @Override
    public void deposit(int accountId, int amount) throws UnknownAccountException {
        View.printDeposite(backManager.deposit(manager.getAccountByID(accountId), amount), amount);
        manager.update();
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        ArrayList<Account> transferMembers = backManager.transfer(manager.getAccountByID(from), manager.getAccountByID(to), amount);
        View.printTransfer(transferMembers.get(0), transferMembers.get(1), amount);
        manager.update();
    }

    public void close(){
        manager.close();
    }

}
