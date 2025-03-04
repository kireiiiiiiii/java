public class SubstringCounter {
    public static void main(String[] args) {
        String[] input = { "BaBaBa", "Ba" };
        int output = counter(input[0], input[1]);
        System.out.println("Text: " + input[0]);
        System.out.println("Subtext: " + input[1]);
        System.out.println(output + " times");
    }

    public static int counter(String text, String subText) {
        int subStringCount = 0;
        int subStringIndex;
        int lenght = subText.length();
        if (lenght == 0) {
            return 0;
        }
        while (true) {
            subStringIndex = text.indexOf(subText);
            if (subStringIndex >= 0) {
                text = text.substring(subStringIndex + lenght);
                subStringCount++;
            } else {
                break;
            }
        }
        return subStringCount;
    }
}
