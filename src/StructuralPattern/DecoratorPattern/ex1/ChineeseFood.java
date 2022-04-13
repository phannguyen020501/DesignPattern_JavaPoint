package StructuralPattern.DecoratorPattern.ex1;

public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() +" With fried rice and manchurian";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() +65;
    }
}
