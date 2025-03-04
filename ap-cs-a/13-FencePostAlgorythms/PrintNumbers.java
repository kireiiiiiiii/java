public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(0);
        printNumbers(5);
    }   
    public static void printNumbers(int max) {
        if (max > 0) {
            System.out.print("1");
            for (int i = 2; i <=max; i++) {
                System.out.print(", " + i);
            }
        }
    } 
}
