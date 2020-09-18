package ru.x5.Task5.logertask.logger;

public class ConsoleLogger implements Log {
    private static ConsoleLogger instance = null;

    private ConsoleLogger () {

    }

    public static ConsoleLogger getInstance() {
        if (instance == null) {
            instance = new ConsoleLogger();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.println("Log into console: {" + message + "}");
    }
}
