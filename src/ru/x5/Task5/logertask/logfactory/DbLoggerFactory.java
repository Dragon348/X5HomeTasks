package ru.x5.Task5.logertask.logfactory;

import ru.x5.Task5.logertask.logger.DbLogger;
import ru.x5.Task5.logertask.logger.Log;

public class DbLoggerFactory extends LogFactory {
    @Override
    public Log createLog() {
        return DbLogger.getInstance();
    }
}
