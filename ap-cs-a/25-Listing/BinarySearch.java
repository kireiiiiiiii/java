public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index = searchBinary(arr, 3);
        System.out.println(index);
    }

    public static int searchBinary(int[] arr, int value) {
        int max = arr.length;
        int min = 0;
        int mid;
        int currEl;
        while (true) {
            mid = max/2;
            currEl = arr[mid];
            if (currEl < value){
                max = mid-1;
            }
            else if (currEl > value) {
                min = max-1;
            }
            else {
                return mid;
            }
        }
    }
}
