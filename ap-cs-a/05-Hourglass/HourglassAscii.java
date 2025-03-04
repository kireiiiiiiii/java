//AP CS A - HOURGLASS ASCII ART "HOURGLASS" PROJECT
// Name: Matej Stastny
// Period: 1
// Date: 10/12/23

// //This program is able to print ascii art various sizes like this one size 4:

// +--------+
// |\....../|
// | \..../ |
// |  \../  |
// |   \/   | 
// |   /\   | 
// |  /..\  | 
// | /....\ | 
// |/......\|
// +--------+

public class HourglassAscii {
    public static int SIZE = 4;
    public static void main(String[] args) {
        printLine();
        printTop();
        printBottom();
        printLine();    
    }

    public static void printCharacter(int count, String character) {
        for (int ch = 1; ch <= count; ch++) {
            System.out.print(character);
        }
    }

    public static void printSpaces(int spaceCount) {
        printCharacter(spaceCount, " ");
    }

    public static void printDots(int dotCount) {
        printCharacter(dotCount, ".");   
    }
    
    public static void printLine() {
        System.out.print("+");
        for (int dash = 1; dash <= SIZE * 2; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void printTop() {
        for (int line = 1; line <= SIZE; line++) {
            int spaceCount = line - 1;
            int dotCount = (SIZE-line)*2;

            System.out.print("|");
            printSpaces(spaceCount);
            System.out.print("\\");
            printDots(dotCount);
            System.out.print("/");
            printSpaces(spaceCount);
            System.out.println('|');
        }    
    }

    public static void printBottom() {
        for (int line = 1; line <= SIZE; line++) {
            int spaceCount = SIZE - line;
            int dotCount = (line -1)*2;
            
            System.out.print("|");
            printSpaces(spaceCount);
            System.out.print("/");
            printDots(dotCount);
            System.out.print("\\");
            printSpaces(spaceCount);
            System.out.println("|");
        }
    }
}
