import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4 , 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] merged = merge(array, array2);
        //int[] copy = arrCopy(array);

        //swap(array);
        
        System.out.println("Array1: " + Arrays.toString(array));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Merged: " + Arrays.toString(merged));
    }

    public static void swap(int[]arr) {
        int[] originArr = arrCopy(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = originArr[arr.length-1-i];
        }
    }

    public static int[] arrCopy(int[] arr) {
        int[] returnArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            returnArr[i] = arr[i];
        }
        return returnArr;
    }

    public static int[] merge(int[] a1, int[] a2) {
        int lenght = a1.length + a2.length;
        int[] returnArr = new int[lenght];
        for (int i = 0; i < a1.length; i++) {
            returnArr[i] = a1[i];
        }
        for (int i = a1.length; i < lenght; i++) {
            returnArr[i] = a2[i - a1.length];
        }
        return returnArr;
    }
}
