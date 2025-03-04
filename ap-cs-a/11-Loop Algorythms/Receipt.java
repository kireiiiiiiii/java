import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        receiptPrint(console);
        console.close();
    }

    public static void receiptPrint(Scanner console) {
        System.out.print("How many people ate? :");
        int peopleCount = console.nextInt();
        double subTotal = 0;
        for (int i = 1; i <= peopleCount; i++) {
            System.out.print("Person #" + i + ": How much did your dinner cost?: ");
            subTotal += console.nextDouble();
        }
        System.out.println("Subtotal: " + subTotal);
        double tax = subTotal/100*8;
        System.out.println("Tax: " + tax);
        double tip = subTotal/100*15;
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + (subTotal+tip+tax));
    }
}
