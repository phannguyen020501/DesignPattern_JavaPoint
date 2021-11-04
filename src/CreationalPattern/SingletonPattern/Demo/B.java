package CreationalPattern.SingletonPattern.Demo;
//understanding lazy instantiation of Singleton x
public class B {
    private static B obj;
    private B(){};

    public static B getB(){
        if(obj == null){
            synchronized (B.class){//đồng bộ
                if(obj == null){
                    obj = new B();
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}
