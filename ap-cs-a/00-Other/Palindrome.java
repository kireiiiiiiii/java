public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeTester("eevee"));
        System.out.println(palindromeTester("nya"));
    }
    
    public static String palindromeTester(String input) {
        input = input.toLowerCase();
        int length = input.length();
        int index = length-1;
        String output = "";
        for (int i = 0; i < length; i++) {
            output = output +input.substring(index-i, index-i+1);
        }
        if (output.equals(input)) {
            return "palindrom";
        }
        else{
            return "not a palindrom (" + output + ")";
        }
    }
}
