public class Mirror {
    public static int SIZE = 3;
    public static void main(String[] args) {
        line();
        topHalf();
        bottomHalf();
        line();
    }

    public static void topHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");

            // This inner loop prints our spaces
            for (int space = 1; space <= (-2 * line + (2*SIZE)); space++) {
                System.out.print(" ");
            }

            System.out.print("<>");

            // This inner loop prints our dots (increasing)
            for (int dot = 1; dot <= (4 * line - 4); dot++) {
                System.out.print(".");
            }

            System.out.print("<>");

            // This inner loop prints our spaces (decreasing)
            for (int space = 1; space <= (-2 * line + 2*SIZE); space++) {
                System.out.print(" ");
            }

            System.out.print("|");

            System.out.println("");
        }
    }

    public static void bottomHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");

            // This inner loop prints our spaces (increasing)
            for (int space = 1; space <= (2 * line - (SIZE/2)); space++) {
                System.out.print(" ");
            }

            System.out.print("<>");

            // This inner loop prints our dots (decreasing)
            for (int dot = 1; dot <= (-4 * line + (SIZE*4)); dot++) {
                System.out.print(".");
            }

            System.out.print("<>");

            // This inner loop prints our spaces (increasing)
            for (int space = 1; space <= (2 * line - (SIZE/2)); space++) {
                System.out.print(" ");
            }

            System.out.print("|");

            System.out.println("");
        }
    }
    
    public static void line() {
        System.out.print("#");

        for(int dashLine = 1; dashLine <= SIZE * 4; dashLine++) {
            System.out.print("-");
        }

        System.out.println("#");
    }
}

