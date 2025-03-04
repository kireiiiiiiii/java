//import MethodTest;

public class replaceAll {
    public static void main(String[] args) {
        System.out.println(stringReplace("1xx 2xx 3xx 4567", "xx", "OO"));
    }

    public static String stringReplace(String input, String target, String replace) {
        if (input.indexOf(target) > -1) {
            int index = input.indexOf(target);
            int length = target.length();
            String secondHalf = input.substring(index + length);
            String output = input.substring(0, index);
            for (int i = secondHalf.indexOf(target); i > -1;) {
                secondHalf = secondHalf.substring(i + length);
                i = secondHalf.indexOf(target);
                output = output + replace + secondHalf;
            }
            return output;
        }

        else {
            return input;
        }
    }
}
