package CreationalPattern.FactoryMethodPattern.Bank;

public class BankFactory {
    private BankFactory(){

    }

    public static final Bank getBank(BankType type){
        switch (type){
            case TPBANK: return new TPBank();
            case VIETCOMBANK:return new VietcomBank();
            default:
                throw new IllegalArgumentException("this bank type is unsupported");
        }
    }
}
