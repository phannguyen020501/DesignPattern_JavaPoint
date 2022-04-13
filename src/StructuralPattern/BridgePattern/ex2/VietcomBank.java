package StructuralPattern.BridgePattern.ex2;

public class VietcomBank extends Bank{

    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("open your account at vietcombank is a ");
        account.openAccount();
    }


}
