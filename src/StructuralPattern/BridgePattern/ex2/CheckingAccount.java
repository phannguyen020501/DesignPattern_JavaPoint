package StructuralPattern.BridgePattern.ex2;

public class CheckingAccount implements Account{

    @Override
    public void openAccount() {
        System.out.println("checking account");
    }
}
