package BehavioralPattern.CommandPattern.ex1;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("pn");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clicCloseAccount();
    }
}
