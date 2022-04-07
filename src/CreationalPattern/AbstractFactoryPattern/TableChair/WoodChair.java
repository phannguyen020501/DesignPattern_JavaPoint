package CreationalPattern.AbstractFactoryPattern.TableChair;

public class WoodChair implements Chair{

    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
