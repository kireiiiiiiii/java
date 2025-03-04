import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        String[] arr = { "a", "b", "c", "d" };
        System.out.println(Arrays.toString(shift(arr, 2)));
    }

    public static String[] shift(String[] arr, int shift) {
        String[] returnArr = new String[arr.length];
        for (int i = 0; i < shift; i++) {
            returnArr[i] = arr[shift + i];
        }
        for (int i = shift; i < arr.length; i++) {
            returnArr[shift] = arr[i - shift];
        }
        return returnArr;
    }
}
