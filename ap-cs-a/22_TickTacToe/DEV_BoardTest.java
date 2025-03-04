public class DEV_BoardTest {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.renderToString());
        System.out.print(board.numberEmpty());
    }
}
