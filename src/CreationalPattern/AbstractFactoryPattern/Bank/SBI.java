package CreationalPattern.AbstractFactoryPattern.Bank;

public class SBI implements Bank{
    private final String BNAME;
    public SBI(){
        BNAME = "SBI Bank";
    }
    @Override
    public String getBankName() {
        return BNAME;
    }
}
