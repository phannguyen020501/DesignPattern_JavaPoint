package CreationalPattern.AbstractFactoryPattern;

public class ICIC implements Bank{
    private final String BNAME;
    public ICIC(){
        BNAME = "ICIC Bank";
    }
    @Override
    public String getBankName() {
        return BNAME;
    }
}
