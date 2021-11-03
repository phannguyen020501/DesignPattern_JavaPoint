package CreationalPattern.AbstractFactoryPattern;

public class HDFC implements Bank{
    private final String BNAME;
    public HDFC(){
        BNAME = "HDFC Bank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
