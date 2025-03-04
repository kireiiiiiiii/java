public class JacksHouse {
    public static void main(String[] args) {
        jackVerse();
        maltVerse();
        ratVerse();
        catVerse();
        dogVerse();
        cowVerse();
        maidVerse();
    }
    public static void jackVerse() {
        System.out.println("This is the house that Jack built.");
        System.out.println("");
    }

    public static void maltVerse() {
        System.out.println("That is the malt,");
        jackVerse();
    }

    public static void ratVerse() {
        System.out.println("This is the rat,");
        maltVerse();
    }

    public static void catVerse() {
        System.out.println("This is the cat,");
        ratVerse();
    }

    public static void dogVerse() {
        System.out.println("This is the dog,");
        catVerse();
    }

    public static void cowVerse() {
        System.out.println("This is the cow with the crumpled horn,");
        dogVerse();
    }

    public static void maidVerse() {
        System.out.println("This is the maiden all forlorn,");
        cowVerse();
    }
}
