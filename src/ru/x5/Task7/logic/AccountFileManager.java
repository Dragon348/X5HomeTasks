package ru.x5.Task7.logic;

import ru.x5.Task7.logic.interfaces.AccountManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountFileManager implements AccountManager {
    private static List<Account> accounts = new ArrayList<>();
    private String fileName;

    @Override
    public Account getAccountByID(int accountID) {
        for (Account account : accounts) {
            if (account.getId() == accountID) {
                return account;
            }
        }
        return null;
    }

    @Override
    public void update() {
        //заглушка для реализации через бд, ничего не делает
    }

    public AccountFileManager(String fileName) throws IOException {
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

    public void close()  {
        File file = new File(fileName);
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Account account : accounts) {
            String accountInfo = account.getId() + "," + account.getHolder() + "," + account.getAmount();
            writer.write(accountInfo);
            writer.newLine();
        }
        writer.close();}
        catch (IOException e) {
            e.printStackTrace();
        }
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
}
