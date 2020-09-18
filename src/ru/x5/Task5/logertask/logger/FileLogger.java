package ru.x5.Task5.logertask.logger;

public class FileLogger implements Log {
    private static FileLogger instance = null;

    private FileLogger() {

    }

    public static FileLogger getInstance() {
        if (instance == null) {
            instance = new FileLogger();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.println("Log into file: {" + message + "}");
    }
}
