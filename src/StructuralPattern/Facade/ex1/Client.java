package StructuralPattern.Facade.ex1;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().byProductByCashWithFreeShipping("pn@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("pn@gmail.com", "00001");
    }
}
