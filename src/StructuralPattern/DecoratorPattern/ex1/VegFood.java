package StructuralPattern.DecoratorPattern.ex1;

public class VegFood implements  Food{

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }
}
