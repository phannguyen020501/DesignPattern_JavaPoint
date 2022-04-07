package CreationalPattern.AbstractFactoryPattern.Bank;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }else if(bank.equalsIgnoreCase("ICIC")){
            return new ICIC();
        }else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
