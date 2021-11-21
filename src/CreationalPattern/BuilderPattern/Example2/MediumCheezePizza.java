package CreationalPattern.BuilderPattern.Example2;

public class MediumCheezePizza extends VegPizza {
    @Override
    public float price() {
        return 220.0f;
    }

    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
