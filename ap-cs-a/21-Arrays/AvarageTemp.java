import java.util.Arrays;
import java.util.Scanner;

public class AvarageTemp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] temps = getTemp(console);
    }

    public static int[] getTemp(Scanner console){
        System.out.print("How many day's temperatures? ");
        int days = 0;
        days = console.nextInt();
        int[] temperatures = new int[days];
        for (int i = 0; i < days; i++) {
            temperatures[i] = console.nextInt();
        }
        return temperatures;
    }

    public static int getAvarage(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static int[] getMax(int[] temperatures) {
        Arrays.sort(temperatures);
        int[] max2 = {0, 0};
        if(temperatures.length >= 2) {
            max2[0] = temperatures[temperatures.length-1];
            max2[1] = temperatures[temperatures.length-2];
            return max
        }
    }
}
