package CreationalPattern.FactoryMethodPattern.Bill;

public class DomesticPlan extends Plan {

    @Override
    void getRate() {
        rate = 3.5;
    }
}
