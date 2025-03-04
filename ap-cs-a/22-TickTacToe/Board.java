/* The Board stores the state of the Tic-Tac-Toe board */
public class Board {
    public static final String empty = " ";

    // 3x3 array of single character Strings. This stores the current
    // state of the board. After construction, it is guarenteed to
    // contain nine String elements.
    // Each element stores one of the following...
    // Board.empty, HumanPlayer.marker, or AiPlayer.marker

    // works for anysized array
    private String[][] board = new String[3][3];

    public Board() {
        reset();
    }

    // Reset board so that each element is a an empty string (use Board.empty)
    // postcondition: board is a 3x3 array. all elements are Board.empty.
    public void reset() {
        for (int i = 0; i < board.length; i++) {
            for (int y = 0; y < board[i].length; y++) {
                board[i][y] = empty;
            }
        }
    }

    // Returns the number of rows in the board
    public int rows() {
        return board.length;
    }

    // Returns the number of columns in the board
    public int columns() {
        return board[0].length;
    }

    // Returns true if the specified row/column space is empty
    // (does not already store an X or O)
    // You can assume r & c are valid values.
    public boolean isEmpty(int r, int c) {
        return board[r][c].equals(empty);
    }

    // Returns the String marker at the specified row/column (e.g. "X")
    // You can assume r & c are valid values.
    public String getMarkerAt(int r, int c) {
        return board[r][c];
    }

    // Creates and returns a String that can be printed to draw the board.
    // Example return value: " X | | O \n-----------\n O | X | \n-----------\n | | O
    // "
    public String renderToString() {
        String render = "";
        for (int i = 0; i < board.length; i++) {
            for (int y = 0; y < board[i].length; y++) {
                // dont add if its the first one
                if (y != 0) {
                    render += " | ";
                }
                // add the contents
                render += board[i][y];
            }
            // dont do after the last row
            if (i != board.length - 1) {
                render += "\n";
                // the dashes, for every element add 3 dashes
                for (int x = 0; x < board.length; x++) {
                    render += "---";
                    // for every element exept the ones on the edge, add one more dash (the dash
                    // with the vertical border)
                    if (x != board.length - 1 && x != 0) {
                        render += "-";
                    }
                }
                render += "\n";
            }
        }
        return render;
    }

    // Returns the number of empty spaces on the board.
    // An empty board (at the start of the game) would return 9.
    // After both players have places one mark, it would return 7.
    public int numberEmpty() {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int y = 0; y < board[i].length; y++) {
                if (board[i][y].equals(empty)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // Update the board with the specified move applied.
    // You can assume it is a valid move.
    public void placeMark(Move move) {
        board[move.r][move.c] = " " + move.mark + " ";
    }

    // Determines if there is a winner, based on the current board state.
    // Note that in the case that no one has won, it returns 0.
    // Returns: 0:none, 1:human(HumanPlayer.marker), 2:AI(AiPlayer.marker)
    public int calcWinner() {
        return 2;
    }
}
