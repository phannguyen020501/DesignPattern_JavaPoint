package BehavioralPattern.ChainOfResponsibility.ex1;

import com.mysql.cj.log.Log;

public class Client {
    public static void main(String[] args) {
        //build the chain of responsibility
        Logger logger = AppLogger.getLogger();

        //handled by ConsoleLogger since the console has a LogLevel of DEBUG
        logger.log(LogLevel.INFO, "infor message");
        logger.log(LogLevel.DEBUG, "debug message");

        //handled by ConsoleLogger and FileLogger
        logger.log(LogLevel.ERROR, "error message");

        //handled by consoleLogger, fileLogger, emailLogger
        logger.log(LogLevel.FATAL, "factal message");
    }
}
