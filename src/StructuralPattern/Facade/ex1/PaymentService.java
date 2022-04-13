package StructuralPattern.Facade.ex1;

public class PaymentService {
    public void paymentByPaypal(){
        System.out.println("payment by paypal");
    }

    public void paymentByCreditCard(){
        System.out.println("payment by credit card");
    }

    public void paymentByEbankingAccount(){
        System.out.println("payment by ebanking account");
    }

    public void paymentByCash(){
        System.out.println("payment by cash");
    }
}
