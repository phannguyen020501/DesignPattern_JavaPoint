package StructuralPattern.BridgePattern.ex2;

public class TPBank extends Bank{
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open account at TPBank is a ");
        account.openAccount();
    }
}
