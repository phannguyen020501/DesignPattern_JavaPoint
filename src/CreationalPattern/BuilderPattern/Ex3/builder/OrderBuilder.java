package CreationalPattern.BuilderPattern.Ex3.builder;

import CreationalPattern.BuilderPattern.Ex3.product.order.Order;
import CreationalPattern.BuilderPattern.Ex3.product.type.BreadType;
import CreationalPattern.BuilderPattern.Ex3.product.type.OrderType;
import CreationalPattern.BuilderPattern.Ex3.product.type.SauceType;
import CreationalPattern.BuilderPattern.Ex3.product.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
    OrderBuilder orderBread(BreadType breadType);
    OrderBuilder orderSauce(SauceType sauceType);
    OrderBuilder orderVegetable(VegetableType vegetableType);
    Order build();


}
