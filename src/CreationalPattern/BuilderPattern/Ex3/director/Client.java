package CreationalPattern.BuilderPattern.Ex3.director;

import CreationalPattern.BuilderPattern.Ex3.concretebuilder.FastfoodOrderBuild;
import CreationalPattern.BuilderPattern.Ex3.product.order.Order;
import CreationalPattern.BuilderPattern.Ex3.product.type.BreadType;
import CreationalPattern.BuilderPattern.Ex3.product.type.OrderType;
import CreationalPattern.BuilderPattern.Ex3.product.type.SauceType;
import CreationalPattern.BuilderPattern.Ex3.product.type.VegetableType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastfoodOrderBuild().orderType(OrderType.ON_SITE)
                .orderBread(BreadType.BEEF).orderSauce(SauceType.KETCHUP)
                .orderVegetable(VegetableType.SALAD).build();// giong data
        System.out.println(order);
    }
}
