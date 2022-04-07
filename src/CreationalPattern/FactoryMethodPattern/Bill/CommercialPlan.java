package CreationalPattern.FactoryMethodPattern.Bill;

public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.0;
    }
}
