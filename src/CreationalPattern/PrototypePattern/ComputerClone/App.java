package CreationalPattern.PrototypePattern.ComputerClone;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer("win 10", "word 2003", "BKAV", "chrome");
        Computer computer2 = computer1.clone();
        computer2.setOthers("asdsadf");
        System.out.println(computer1);
        System.out.println(computer2);

    }
}
