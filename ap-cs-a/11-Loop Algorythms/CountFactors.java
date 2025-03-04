import java.util.Arrays;

public class CountFactors {
    public static void main(String[] args) {
        int[] factors = factorCounter(24);
        System.out.println(Arrays.toString(factors));
    }
    public static int[] factorCounter(int number) {
        int[] factors = {0,0,0,0,0,0,0,0,0,0,0,};
        int index = 0;
        int remainder = 0;
        for (int i = 1; i <= number; i++) {
            remainder = number%i;
            if (remainder == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
}
