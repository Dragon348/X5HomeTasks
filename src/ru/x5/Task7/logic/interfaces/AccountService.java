package ru.x5.Task7.logic.interfaces;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;

public interface AccountService {
    void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void balance(int accountId) throws UnknownAccountException;

    void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException;
}

