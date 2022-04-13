package StructuralPattern.BridgePattern.ex2;

public class SavingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("Saving account");
    }
}
