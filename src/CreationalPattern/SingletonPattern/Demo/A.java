package CreationalPattern.SingletonPattern.Demo;
//early instantiation
public class A {
    private static A obj = new A();//early instance will be created at load time
    private A(){
    };
    public static A getA(){
        return obj;
    }
    public void doSomething(){
        //write your code
    }
}
