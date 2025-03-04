import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        String input[] = {"Banana", "Apple", "Orange"};
        String winner = elementPicker(input);
        System.out.println(winner);
    }

    //picks a random element of a array of strings
    public static String elementPicker(String[] input) {
        int length = input.length;
        Random randomPick = new Random();
        String winner = input[randomPick.nextInt(length)];
        return winner;
    }
}
