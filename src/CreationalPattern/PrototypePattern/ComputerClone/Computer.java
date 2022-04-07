package CreationalPattern.PrototypePattern.ComputerClone;

public class Computer implements Cloneable {
    private String os;
    private String office;
    private String antivirus;
    private String others;

    public Computer(String os, String office, String antivirus, String others) {
        this.os = os;
        this.office = office;
        this.antivirus = antivirus;
        this.others = others;
    }

    @Override
    protected Computer clone(){
        try{
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", office='" + office + '\'' +
                ", antivirus='" + antivirus + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAntivirus() {
        return antivirus;
    }

    public void setAntivirus(String antivirus) {
        this.antivirus = antivirus;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
