package BehavioralPattern.ChainOfResponsibility.ex2;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNext(Approver approver){
        this.nextApprover = approver;
    }

    protected abstract boolean canApprove(int numberOfDays);
    protected abstract void doApproving(LeaveRequest leaveRequest);

    public void approveLeave(LeaveRequest request){
        System.out.println("checking permission for " + this.getClass().getSimpleName());
        if(this.canApprove(request.getDays())){
            this.doApproving(request);
        }else if( nextApprover != null){
            nextApprover.approveLeave(request);
        }
    }

}
