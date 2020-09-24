package ru.x5.Task7.logic;

import ru.x5.Task7.Exceptions.NotEnoughMoneyException;
import ru.x5.Task7.Exceptions.UnknownAccountException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();
    private String fileName;
    public AccountManager(String fileName) throws IOException {
        this.fileName = fileName;
        File file = new File(fileName);
        if (!file.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            createAccounts(writer);
            writer.close();
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String nextLine = reader.readLine();
        while (nextLine != null) {
            accounts.add(parseAccount(nextLine));
            nextLine = reader.readLine();
        }
        reader.close();
    }

    public void close() throws IOException{
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Account account: accounts) {
            String accountInfo = account.getId() + "," + account.getHolder() + "," + account.getAmount();
            writer.write(accountInfo);
            writer.newLine();
        }
        writer.close();
    }

    public void createAccounts(BufferedWriter writer) throws IOException {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            String accountInfo = i + "," + "name" + i + "," + random.nextInt(1000000);
            writer.write(accountInfo);
            writer.newLine();
        }
    }

    public Account parseAccount(String account) {
        String[] accountInfo = account.split(",");
        return new Account(Integer.parseInt(accountInfo[0]), accountInfo[1], Integer.parseInt(accountInfo[2]));
    }

    public Account getAccountByID(int accountID) {
        for (Account account : accounts) {
            if (account.getId() == accountID) {
                return account;
            }
        }
        return null;
    }

    public Account withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account currentAccount = getAccountByID(accountId);
        if (currentAccount == null) {
            throw new UnknownAccountException("Аккаунт не найден");
        } else if (amount > currentAccount.getAmount()) {
            throw new NotEnoughMoneyException("Недостаточно денег на счёте");
        } else {
            currentAccount.setAmount(currentAccount.getAmount() - amount);
            return currentAccount;
        }
    }

    public Account balance(int accountId) throws UnknownAccountException {
        Account currentAccount = getAccountByID(accountId);
        if (currentAccount == null) {
            throw new UnknownAccountException("Аккаунт не найден");
        } else {
            return currentAccount;
        }
    }

    public void printBalance(Account account) {
        System.out.println("Текущий баланс счёта " + account.getId() + ". Держатель " + account.getHolder() + ": " + account.getAmount());
    }

    public Account deposit(int accountId, int amount) throws UnknownAccountException {
        Account currentAccount = getAccountByID(accountId);
        if (currentAccount == null) {
            throw new UnknownAccountException("Аккаунт не найден");
        } else {
            currentAccount.setAmount(currentAccount.getAmount() + amount);
            return currentAccount;
        }
    }

    public ArrayList<Account> transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account fromAccount = getAccountByID(from);
        Account toAccount = getAccountByID(to);
        if (fromAccount == null) {
            throw new UnknownAccountException("Аккаунт " + from + " не найден");
        } else if (toAccount == null) {
            throw new UnknownAccountException("Аккаунт " + to + " не найден");
        } else if (amount > fromAccount.getAmount()) {
            throw new NotEnoughMoneyException("Недостаточно денег на счёте");
        } else {
            withdraw(from, amount);
            deposit(to, amount);
            ArrayList<Account> transferMembers = new ArrayList<>();
            transferMembers.add(fromAccount);
            transferMembers.add(toAccount);
            return transferMembers;
        }
    }
}