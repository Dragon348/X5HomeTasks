package ru.x5.Task5.logertask.App;

import ru.x5.Task5.logertask.logfactory.*;
import ru.x5.Task5.logertask.logger.Log;

import java.util.Scanner;

public class LogCreator {
    public static Log createLogger(Scanner sc) {
        System.out.println("Введите DBLOGGER, FILELOGGER или CONSOLELOGGER для создания соответствующего логера");
        LogType type = null;
        try {
            type = LogType.valueOf(sc.nextLine());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        LogFactory factory = null;
        switch (type) {
            case FILELOGGER:
                factory = new FileLoggerFactory();
                break;
            case DBLOGGER:
                factory = new DbLoggerFactory();
                break;
            case CONSOLELOGGER:
                factory = new ConsoleLogFactory();
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        if (factory != null) {
            return factory.createLog();
        }
        return null;
    }
}
