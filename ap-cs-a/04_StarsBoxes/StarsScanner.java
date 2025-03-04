import java.util.Scanner;

public class StarsScanner {
    public static void main(String[] args) {
        int lenght = 0;
        int width = 0;

        Scanner lenghtScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Lenght?");
            if (lenghtScanner.hasNextInt()) {
                lenght = lenghtScanner.nextInt();
                break;
            } else {
                System.out.println("Your input wasn't a number!");
                lenghtScanner.next();
            }
        }

        Scanner widthScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Width?");
            if (widthScanner.hasNextInt()) {
                width = widthScanner.nextInt();
                break;
            } else {
                System.out.println("Your input wasn't a number! ");
                widthScanner.next();
            }
        }

        line(lenght);
        System.out.println();
        box(width, lenght);

        lenghtScanner.close();
        widthScanner.close();
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
