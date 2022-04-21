package BehavioralPattern.CommandPattern.ex1;

public class OpenAccount implements Command{
    private Account account;

    public OpenAccount(Account account){
        this.account = account;
    }
    @Override
    public void execute() {
        account.open();
    }
}
