public class SumOfInts {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int max) {
        int sum = 0;
        for (int i = 1; i <=max; i++) {
            sum =sum + i;
        }
        return sum;
    }
}