package CreationalPattern.BuilderPattern.Example2;

public class MediumCoke extends Coke {
    @Override
    public String name() {
        return "500 ml Coke";
    }

    @Override
    public String size() {
        return "Medium size";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
