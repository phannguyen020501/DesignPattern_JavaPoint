package StructuralPattern.AdapterPattern.ex1;

import StructuralPattern.AdapterPattern.ex1.BankCustomer;
import StructuralPattern.AdapterPattern.ex1.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
