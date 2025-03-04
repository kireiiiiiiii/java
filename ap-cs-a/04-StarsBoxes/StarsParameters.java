package StarsBoxes;

public class StarsParameters {
    public static int LENGHT = 12;
    public static int WIDTH = 5;
    public static void main(String[] args) {
        line(14);
        box(7, 14);
    }

    public static void line(int lenght) {
        for (int i = 1; i <= lenght; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void box(int width, int lenght) {
        line(lenght);
        
        for (int line = 1; line <= width - 2; line++) {
            System.out.print("*");
            for (int space = 1; space <= lenght - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        line(lenght);
    }
}
