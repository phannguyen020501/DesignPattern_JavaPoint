package StructuralPattern.BridgePattern.ex2;

public class Client {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();

        Bank tpbank = new TPBank(new SavingAccount());
        tpbank.openAccount();
    }
}
