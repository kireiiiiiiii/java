public class Power {
    public static void main(String[] args) {
        System.out.println(pow(3, 4));
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return pow(a, b - 1) * a;
    }
}
