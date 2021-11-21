package CreationalPattern.BuilderPattern.Example1;

import CreationalPattern.BuilderPattern.Example1.Company;

public class Sony extends Company {

    @Override
    public int price() {
        return 15;
    }

    @Override
    public String pack(){
        return "Sony CD";
    }
}
