public class Words {
    public static void main(String[] args) {
        String word1 = "Bare";
        String word2 = "Blare";

        // Rhyme test
        if (validLenght(word1) && rhymes(word1, word2))
            System.out.println("They rhyme!");

        // Alliteration test
        if (alliterates(word1, word2))
            System.out.println("They alliterate!");
    }

    // Boolean Zen methods

    public static boolean validLenght(String word) {
        return word.length() >= 2;
    }

    public static boolean rhymes(String word1, String word2) {
        return word1.endsWith(word2.substring(word2.length() - 2));
    }

    public static boolean alliterates(String word1, String word2) {
        return word1.charAt(0) == word2.charAt(0);
    }
}
