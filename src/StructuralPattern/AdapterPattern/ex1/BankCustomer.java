package StructuralPattern.AdapterPattern.ex1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//this is the adapter class
public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name:");
            String customername = br.readLine();
            System.out.println("\n");

            System.out.println("Enter the account number:");
            long accno = Long.parseLong(br.readLine());
            System.out.println("\n");

            System.out.println("Enter the bank name:");
            String bankname = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();
        return ("The account number "+accno+" of "+accholdername+" in "+bname
                +" bank is valid and authenticated for issuing the credit card");
    }
}
