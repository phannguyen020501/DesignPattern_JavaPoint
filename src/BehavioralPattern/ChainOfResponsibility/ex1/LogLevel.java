package BehavioralPattern.ChainOfResponsibility.ex1;

public enum LogLevel {
    NONE(0), INFO(1), DEBUG(2),WARNING(4), ERROR(8), FATAL(16), ALL(32);

    private int level;

    private LogLevel(int i) {
        this.level = i;
    }

    public int getLevel(){
        return level;
    }
}
