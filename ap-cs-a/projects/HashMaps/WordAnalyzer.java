import java.util.ArrayList;

public class WordAnalyzer {

    private final String[] TRASH = {".", ",", "!", "?", "\""};

    private String text;
    private int lastSpaceIdx;
    private ArrayList<String> wordList;

    public WordAnalyzer(String text) {
        this.text = text;
        this.lastSpaceIdx = 0;
        this.wordList = new ArrayList<String>();
    }

    public void refresh() {
        this.text = this.text.toLowerCase();
        clearText();
        this.lastSpaceIdx = 0;
        String result = getNextWord();
        do {
            if (result == null) {
                break;
            }
            this.wordList.add(getNextWord());
        } while (result != null);
    }

    // null if end
    public String getNextWord() {
        if (this.text.length() - 1 < this.lastSpaceIdx + 1) {
            return null;
        }
        String subText = this.text.substring(lastSpaceIdx + 1);
        int newSpaceIdx = subText.indexOf(" ");
        if (newSpaceIdx == -1) {
            return null;
        }
        this.lastSpaceIdx = newSpaceIdx;
        return subText.substring(0, newSpaceIdx);
    }

    private void clearText() {
        boolean found = true;
        while (!found) {
            for (String s : this.TRASH) {
                int index = this.text.indexOf(s);
                if (index == -1) {
                    continue;
                }
                found = true;
                String firstHalf = this.text.substring(0, index);
                String secondHalf = this.text.substring(index + 1);
                this.text = firstHalf + secondHalf;
            }
        }
    }

    @Override
    public String toString() {
        return this.wordList.toString();
    }

}