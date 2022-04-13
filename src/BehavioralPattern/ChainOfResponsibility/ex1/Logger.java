package BehavioralPattern.ChainOfResponsibility.ex1;

public abstract class Logger {
    protected LogLevel logLevel;

    protected Logger nextLogger;

    public Logger(LogLevel logLevel){
        this.logLevel = logLevel;
    }

    //set the next logger to make a list/chain of handlers

    public Logger setNext(Logger nextLogger){
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel severity, String msg){
        if(logLevel.getLevel() <= severity.getLevel()){
            writeMessage(msg);
        }
        if(nextLogger != null){
            nextLogger.log(severity, msg);
        }
    }

    protected abstract void writeMessage(String msg);
}
