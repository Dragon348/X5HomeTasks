package ru.x5.Task5.logertask.logger;

public class DbLogger implements Log {
    private static DbLogger instance = null;

    private DbLogger() {

    }

    public static DbLogger getInstance() {
        if (instance == null) {
            instance = new DbLogger();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.println("Log into database: {" + message + "}");
    }
}
