package StarsBoxes;

public class Stars {
    public static void main(String[] args) {
        lineOf13();
        lineOf7();
        lineOf35();
        box10x3();
        box5x4();
    }

    public static void lineOf5() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOf7() {
        for (int i = 1; i <= 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOf10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void lineOf13() {
        for (int i = 1; i <= 13; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void lineOf35() {
        for (int i = 1; i <= 35; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void box10x3() {
        lineOf10();
        
        for (int line = 1; line <= 3 - 2; line++) {
            System.out.print("*");
            for (int space = 1; space <= 10 - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        lineOf10();
    }

    public static void box5x4() {
        lineOf5();
        
        for (int line = 1; line <= 4 - 2; line++) {
            System.out.print("*");
            for (int space = 1; space <= 5 - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        lineOf5();
    }
}
