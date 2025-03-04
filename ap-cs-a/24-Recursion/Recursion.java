public class Recursion {
    public static void main(String[] args) {
        printStar(1);
    }

    public static int printStar(int i) {
        if (i == 5) {
            return -1;
        }
        System.out.println("*");
        int star = printStar(i + 1);
        if (star != -1) {
            printStar(i);
        }
        return 0;
    }
}
