package BehavioralPattern.ChainOfResponsibility.ex2;

public class LeaveRequest {
    private int days;

    public LeaveRequest(int days) {
        this.days = days;
    }

    public LeaveRequest(){

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
