package CreationalPattern.BuilderPattern.Example1;

import CreationalPattern.BuilderPattern.Example1.Company;

public class Samsung extends Company {

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack(){
        return "Samsung CD";
    }
}
