public class IsItAVowel {
    public static void main(String[] args) {
        assert (isVowel("A")) == true;
        assert (isVowel("q")) == false;
        assert (isNotVowel("Q")) == true;
        assert (isNotVowel("A")) == false;
    }

    public static boolean isVowel(String letter) {
        return ("a e i o u").indexOf(letter.toLowerCase()) != -1;
    }

    public static boolean isNotVowel(String letter) {
        return !isVowel(letter);
    }
}
