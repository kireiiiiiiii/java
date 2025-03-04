import java.util.Random;

public class Arrays2D {
    public static void main(String[] args) {
        int[] random = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(randomAcces(random));
    }

    public static int randomAcces(int[] arr) {
        Random rand = new Random();
        return arr[rand.nextInt(arr.length)];
    }
}
