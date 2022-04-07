package CreationalPattern.FactoryMethodPattern.Bank;

import CreationalPattern.FactoryMethodPattern.Bank.Bank;

public class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "TPBank";
    }
}
