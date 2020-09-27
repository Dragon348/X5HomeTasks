package ru.x5.Task7.logic.interfaces;

import ru.x5.Task7.logic.Account;

public interface AccountManager {

    Account getAccountByID(int accountID);

    void update();

    void close();
}
