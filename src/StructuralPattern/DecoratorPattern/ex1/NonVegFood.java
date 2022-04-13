package StructuralPattern.DecoratorPattern.ex1;

public class NonVegFood extends  FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() +" With roasted chicken and chicken curry";
    }

    public double foodPrice(){
        return super.foodPrice() + 150;
    }
}
