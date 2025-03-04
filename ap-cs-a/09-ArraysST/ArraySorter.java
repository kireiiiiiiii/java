public class ArraySorter {
    public static void main(String[] args) {
        int[] input = { 5, 4, 2, 3, 1 };
        System.out.println(java.util.Arrays.toString(input));
        System.out.println(java.util.Arrays.toString(sorter(input)));
        // System.out.println(java.util.Arrays.toString(sorter(new int[] {-5, 2, -3})));
        // System.out.println(java.util.Arrays.toString(sorter(new int[] {})));
    }

    public static int[] sorter(int[] input) {
        int length = input.length;
        int minValueIndex = 0;
        // int[] output = new int [length];
        int minValue = 0;
        for (int i = 1; i <= length - 1; i++) {
            for (int n = i - 1; n < length; n++) {
                if (input[n] < minValue) {
                    minValue = input[n];
                    minValueIndex = n;
                } else {
                }
            }
            input[minValueIndex] = input[i - 1];
            input[i - 1] = minValue;
            minValue = input[i];
        }
        return input;
    }
}
