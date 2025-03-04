public class SignsMethodsV2 {
    public static void main(String[] args) {
        egg();
        bowl();
        stopSign();
        hat();
    }

    public static void egg() {
        eggTop();
        eggBottom();
        System.out.println(" ");
    }
    public static void bowl() {
        eggBottom();
    }
    public static void stopSign() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("|  STOP  |");
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
    }
    public static void hat() {
        eggTop();
    }
    public static void eggTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    public static void eggBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }


}