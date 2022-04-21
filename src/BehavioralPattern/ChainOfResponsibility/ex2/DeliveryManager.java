package BehavioralPattern.ChainOfResponsibility.ex2;

public class DeliveryManager extends Approver{
    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 5;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("leave request approved for " + leaveRequest.getDays() + " by Delivery Manager");

    }
}
