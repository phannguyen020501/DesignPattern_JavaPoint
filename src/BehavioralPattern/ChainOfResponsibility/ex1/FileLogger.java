package BehavioralPattern.ChainOfResponsibility.ex1;

public class FileLogger extends Logger{
    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("File logger: " + msg);
    }
}
