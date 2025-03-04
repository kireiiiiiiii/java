import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = 1;
        int sum = 0;
        while (input != 0) {
            System.out.print("Enter  number (0 to quit): ");
            input = console.nextInt();
            sum += input;
        }
        System.out.println("The sum is " + sum);
        console.close();
    }
}
