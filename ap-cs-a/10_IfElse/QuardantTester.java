public class QuardantTester {
    public static void main(String[] args) {
        System.out.println(whichQ(0, 50) + " == 0");
        System.out.println(whichQ(50, 0) + " == 0");
        System.out.println(whichQ(50, 50) + " == 1");
        System.out.println(whichQ(-50, 50) + " == 2");
        System.out.println(whichQ(-11.234, -123.123) + " == 3");
        System.out.println(whichQ(50, -50) + " == 4");
    }

    public static int whichQ(double x, double y) {
        // quadrant 1 or 4
        if (x > 0) {
            if (y > 0) {
                return 1;
            } else if (y < 0) {
                return 4;
            } else {
                return 0;
            }
        }
        // quadrant 2 or 3
        else if (x < 0) {
            if (y > 0) {
                return 2;
            } else if (y < 0) {
                return 3;
            } else {
                return 0;
            }
        }
        // x == 0
        else {
            return 0;
        }
    }
}
