package ru.x5.Task5.logertask.logfactory;

import ru.x5.Task5.logertask.logger.FileLogger;
import ru.x5.Task5.logertask.logger.Log;

public class FileLoggerFactory extends LogFactory {
    @Override
    public Log createLog() {
        return FileLogger.getInstance();
    }
}
