package CreationalPattern.BuilderPattern.Example2;

public class SmallMasalaPizza extends VegPizza {

    @Override
    public float price() {
        return 100.0f;
    }

    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
