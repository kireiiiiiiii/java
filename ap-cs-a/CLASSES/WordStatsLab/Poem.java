//Author: Matej Stastny
//Date: 2/26/2024

import java.util.ArrayList;

public class Poem {
    private ArrayList<String> poem = new ArrayList<String>();

    /**
     * Constructor for the object poem
     * 
     * @param poem - String of the whole poem, no double spaces should occur
     */
    public Poem(String poem) {
        separate(format(poem));
    }

    /**
     * Formats the poem string, removing all commas and dots, and converting it to
     * lowercase
     * 
     * @param poem - String of the whole poem, no double spasec should occur
     * @return - returns the formated as a spaced string
     */
    public String format(String poem) {
        poem = poem.toLowerCase();
        for (int commas = poem.indexOf(","); commas != -1; commas = poem.indexOf(",")) {
            poem = poem.substring(0, commas) + poem.substring(commas + 1, poem.length());
        }
        for (int commas = poem.indexOf("."); commas != -1; commas = poem.indexOf(".")) {
            poem = poem.substring(0, commas) + poem.substring(commas + 1, poem.length());
        }
        return poem;
    }

    /**
     * Separates the words from the string, and adds them to the list
     * 
     * @param poem - string of the poem, should be formated
     */
    public void separate(String poem) {
        this.poem.clear();
        int previousIndex = 0;
        String currWord = "";
        for (int spaces = poem.indexOf(" "); spaces != -1; spaces = poem.indexOf(" ")) {
            currWord = poem.substring(previousIndex, spaces);
            this.poem.add(currWord);
            poem = poem.substring(spaces + 1, poem.length());
        }
    }

    /**
     * Accesor method
     * 
     * @return - returns a string array lists of individual words, no empty strings,
     *         no commas or dots, all lowercase
     */
    public ArrayList<String> getPoem() {
        return poem;
    }
}
