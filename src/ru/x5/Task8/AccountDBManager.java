package ru.x5.Task8;

import ru.x5.Task7.logic.Account;
import ru.x5.Task7.logic.interfaces.AccountManager;

import java.sql.*;
import java.util.ArrayList;

public class AccountDBManager implements AccountManager {
    private Connection connection;
    private PreparedStatement statement = null;
    private ArrayList<Account> toUpdate = new ArrayList<>();

    public AccountDBManager(String initStatement) throws SQLException {
        connection = DriverManager.getConnection(initStatement);
    }

    @Override
    public Account getAccountByID(int accountId) {
        if (connection != null) {
            ResultSet resultSet;

            String select = "SELECT * FROM ACCOUNT WHERE ID = ?";
            try {
                statement = this.connection.prepareStatement(select);
                statement.setInt(1, accountId);
                statement.execute();
                resultSet = statement.getResultSet();
                if (resultSet.next()) {
                    Account loadedAccount = new Account(resultSet.getInt("ID"), resultSet.getString("HOLDER"), resultSet.getInt("AMOUNT"));
                    toUpdate.add(loadedAccount);
                    return loadedAccount;
                } else {
                    return null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            System.out.println("Соединение с БД не установлено");
            return null;
        }
    }

    @Override
    public void update() {
        String selectUpdate;
        try {
            selectUpdate = "UPDATE ACCOUNT SET AMOUNT=? WHERE ID=?";
            for (Account account : toUpdate) {
                PreparedStatement statementUpdate = this.connection.prepareStatement(selectUpdate);
                statementUpdate.setInt(1, account.getAmount());
                statementUpdate.setInt(2, account.getId());
                statementUpdate.execute();
                statementUpdate.close();
            }
            toUpdate.clear();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
