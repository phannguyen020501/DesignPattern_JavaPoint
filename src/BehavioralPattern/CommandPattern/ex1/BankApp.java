package BehavioralPattern.CommandPattern.ex1;

public class BankApp {
    private Command openAccount;
    private Command closeAccount;

    public BankApp(Command openAccount, Command closeAccount){
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public void clickOpenAccount(){
        System.out.println("user click open an account");
        openAccount.execute();;
    }

    public void clicCloseAccount(){
        System.out.println("user click close an account");
        closeAccount.execute();
    }
}
