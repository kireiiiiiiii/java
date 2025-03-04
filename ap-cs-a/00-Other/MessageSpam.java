package Other;
public class MessageSpam {
    public static void first() {
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
        System.out.println("spam");
    }

    public static void second() {
        first();
        first();
        first();
        first();
        first();
        first();
        first();
        first();
        first();
        first();
    }

    public static void third() {
        second();
        second();
        second();
        second();
        second();
        second();
        second();
        second();
        second();
        second();
    }

    public static void main(String[] args) {
        third();
    }
}
