package StructuralPattern.Facade.ex1;

public class ShippingService {
    public void freeShipping(){
        System.out.println("free shipping");
    }

    public void standardShipping(){
        System.out.println("standard shipping");
    }

    public void expressShipping(){
        System.out.println("express shipping");
    }
}
