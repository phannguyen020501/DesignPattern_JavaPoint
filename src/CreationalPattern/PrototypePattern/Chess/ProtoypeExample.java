package CreationalPattern.PrototypePattern.Chess;

public class ProtoypeExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Board board = new Board();
        long endTime = System.currentTimeMillis();
        System.out.println("time create a board: " + (endTime- startTime));
        board.print();
    }
}
