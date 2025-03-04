public class HourglassAsciiV2 {
    public static int SIZE = 69;

    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
    }

    public static void line() {
        System.out.print("+");
        for (int dash = 1; dash <= SIZE * 2; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void top() {
        for (int row = 1; row <= SIZE; row++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int dots = 0; dots <= (SIZE - 1) * 2 - (row * 2 - 1); dots++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int spaces2 = 1; spaces2 <= row - 1; spaces2++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottom() {
        for (int row = 1; row <= SIZE; row++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= SIZE - row; spaces++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int dots = 1; dots <= (row - 1) * 2; dots++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int spaces2 = 1; spaces2 <= SIZE - row; spaces2++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

/*
 * +--------+
 * |\....../|
 * | \..../ |
 * | \../ |
 * | \/ |
 * | /\ |
 * | /..\ |
 * | /....\ |
 * |/......\|
 * +--------+
 * 
 * +------------+
 * |\........../|
 * | \......../ |
 * | \....../ |
 * | \..../ |
 * | \../ |
 * | \/ |
 * | /\ |
 * | /..\ |
 * | /....\ |
 * | /......\ |
 * | /........\ |
 * |/..........\|
 * +------------+
 */
