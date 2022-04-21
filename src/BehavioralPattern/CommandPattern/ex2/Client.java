package BehavioralPattern.CommandPattern.ex2;

public class Client {
    public static void main(String[] args) {
        DocumentInvoker instance = new DocumentInvoker();
        instance.write("1st text");
        instance.undo();
        instance.read(); //empty

        instance.redo();
        instance.read();//1st text

        instance.write("2nd text");
        instance.write("3rd text");
        instance.read();// 1st, 2rd, 3rd,
        instance.undo();// 1st, 2rd
        instance.undo();// 1st
        instance.undo();//empty
        instance.undo();//nothing to undo
    }
}
