import java.util.*;

public class UntilNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = 0;
        int number2 = 0;
        int number = 0;
        int counter = 0;
        while (number != 7) {
            number1 = rollDice(6, rand);
            number2 = rollDice(6, rand);
            number = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + number);
            counter++;
        }
        System.out.println("You won after " + counter + " tries!");
        

    }

    public static int rollDice(int max, Random rand) {
        int output = 0;
        output += rand.nextInt(max) + 1;
        return output;
    }
}
