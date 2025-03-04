import java.util.Scanner;
import java.lang.Math;

public class AddSubstract {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double input = 1;
        double sum = 0;
        while (console.hasNextDouble() || console.hasNextInt()) {
            System.out.print("Enter  number ('exit' to quit): ");
            input = console.nextInt();
            if (input < 0) {
                sum -= Math.abs(input);
            }
            else {
                sum += input;
            }
        }
        System.out.println("The sum is " + sum);
        console.close();
    }
}
