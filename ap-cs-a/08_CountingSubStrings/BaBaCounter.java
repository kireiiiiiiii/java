public class BaBaCounter {

    public static void main(String[] args) {
        String text = "A Ba Ba Ba Ba Ba Barbara";
        String originalText = text;
        int baIndex;
        int baCounter = 0;
        while (true) {
            baIndex = text.indexOf("Ba");
            if (baIndex >= 0) {
                text = text.substring(baIndex + 2);
                baCounter++;
            } else {
                System.out.println("Original text: " + originalText);
                System.out.println("Number of \"ba\": " + baCounter);
                break;
            }
        }
    }
}
