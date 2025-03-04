import java.util.Scanner;

public class Boomer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        agePrompt(console);
    }

    public static void agePrompt(Scanner console) {
        System.out.print("Enter your age: ");
        int age = console.nextInt();

        if (age > 18) {
            System.out.println("OK, Boomer.");
        }
    }
}
