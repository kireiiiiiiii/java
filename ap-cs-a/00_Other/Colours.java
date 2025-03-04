public class Colours {
    public static void main(String[] args) {
        // String greenB = "\u001b[42m";
        String yellowB = "\u001b[43m";
        // String redB = "\u001b[41m";
        String whiteB = "\u001b[47m";

        String blackT = "\u001b[30m";

        String reset = "\u001B[0m";
        System.out.println(
                whiteB + blackT + "          dsfsdf" + reset + yellowB + blackT + "         sdfdsfdsk" + reset);
    }
}
