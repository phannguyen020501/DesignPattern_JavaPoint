package CreationalPattern.BuilderPattern.Ex3.concretebuilder;

import CreationalPattern.BuilderPattern.Ex3.builder.OrderBuilder;
import CreationalPattern.BuilderPattern.Ex3.product.order.Order;
import CreationalPattern.BuilderPattern.Ex3.product.type.BreadType;
import CreationalPattern.BuilderPattern.Ex3.product.type.OrderType;
import CreationalPattern.BuilderPattern.Ex3.product.type.SauceType;
import CreationalPattern.BuilderPattern.Ex3.product.type.VegetableType;

public class FastfoodOrderBuild implements OrderBuilder {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;


    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
