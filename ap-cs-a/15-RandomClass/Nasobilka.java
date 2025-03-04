import java.util.*;

public class Nasobilka {
    public static final int MAXNUM = 10;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int[] results = equations(rand, console, 3);
        System.out.println("Correct: " + results[0] + " Incorrect: " + results[1]);
    }

    public static int[] giveEquation(Random rand) {
        int number1 = rand.nextInt(MAXNUM) + 1;
        int number2 = rand.nextInt(MAXNUM) + 1;
        int answer = number1 * number2;
        int array[] = { number1, number2, answer };
        // System.out.print("**" + array[2] + "**");
        return array;
    }

    public static void printEquation(int array[]) {
        assert array.length == 3 : "printEquation: array has not 3 elements";
        System.out.print(array[0] + " * " + array[1] + " = ");
    }

    // public static int takeInt(Scanner console) {
    // int input = 0;
    // boolean b = false;
    // while (!console.hasNextInt() && b == false) {
    // System.out.print("Invalid input, enter a number: ");
    // console.next();
    // if (input.i)
    // }
    // input = console.nextInt();
    // return input;
    // }

    public static int takeInt(Scanner console) {
        int input = 0;
        String line = "";

        while (true) {
            line = console.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Enter a number: ");
                continue;
            }

            try {
                input = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a number: ");
            }
        }

        return input;
    }

    public static int[] equations(Random rand, Scanner console, int max) {
        int incorrect = 0;
        int correct = 0;
        for (int i = 0; i < max; i++) {
            int[] equation = giveEquation(rand);
            int input = 0;
            int tries = 1;
            printEquation(equation);
            input = takeInt(console);
            while (input != equation[2] && tries != 3) {
                tries++;
                System.out.print("Incorect (" + (4 - tries) + " rem):");
                input = takeInt(console);
            }
            // System.out.print(">" + tries + "<");

            if (!(tries == 3)) {
                incorrect++;
            } else {
                correct++;
            }
        }
        int[] results = { correct, incorrect };
        return results;
    }

}
