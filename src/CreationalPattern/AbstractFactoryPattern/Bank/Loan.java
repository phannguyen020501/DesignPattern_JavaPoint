package CreationalPattern.AbstractFactoryPattern.Bank;

abstract public class Loan {
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamout, int years){
        double EMI;
        int n;
        n = years*12;
        rate = rate/1200;
        EMI = ((rate*Math.pow((1+rate), n))/(Math.pow(1+rate, n)-1))*loanamout;
        System.out.println("your monthly EMI is: " + EMI + " for the amount " + loanamout+" you have borrowed");
    }
}
