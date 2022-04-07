package CreationalPattern.SingletonPattern2;

public class DoubleCheck {
    private static volatile DoubleCheck instance;

    private DoubleCheck(){

    }

    private static DoubleCheck getInstance(){
        if(instance == null){
            synchronized (DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
