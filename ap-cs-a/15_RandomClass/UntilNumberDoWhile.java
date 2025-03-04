import java.util.*;

public class UntilNumberDoWhile {
    public static void main(String[] args) {
        Random rand = new Random();
        int roll1 = 0;
        int roll2 = 0;
        int counter = 0;
        do {
            counter++;
            roll1 = rand.nextInt(6) + 1;
            roll2 = rand.nextInt(6) + 1;
            System.out.println("" + roll1 + " + " + roll2 + " = ");
        } while (!((roll1 + roll2) == 7));

        System.out.printf("You won after " + counter + " tries!");
    }
}
