package BehavioralPattern.ChainOfResponsibility.ex2;

public class Supervisor extends Approver{

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 3;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("leave request approved for " + leaveRequest.getDays() + " by supervisor");
    }
}
