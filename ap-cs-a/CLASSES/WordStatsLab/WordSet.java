//Author: Matej Stastny
//Date: 2/27/2024

import java.util.ArrayList;

public class WordSet {
    public ArrayList<String> addedWords = new ArrayList<String>();
    public ArrayList<Integer> occurence = new ArrayList<Integer>();

    /**
     * Constructor for the object WordSet, adds all the words from the parameter to
     * a local variable, and counts their occurence
     * 
     * @param poem - object of the type poem, containing the array of separated
     *             words
     */
    public WordSet(Poem poem) {
        ArrayList<String> poemWords = poem.getPoem();
        for (int i = 0; i < poemWords.size(); i++) {
            add(poemWords.get(i));
        }
        sort();
    }

    /**
     * Adds a new word into local variables, if the word already exists in this word
     * set, it will just increase its occurence
     * 
     * @param word - string containing the word thats being added
     */
    public void add(String word) {
        int index = addedWords.indexOf(word);
        if (index == -1) {
            addedWords.add(word);
            occurence.add(1);
        } else {
            occurence.set(index, occurence.get(index) + 1);
        }
    }

    /**
     * Sorts the current local arrays elements according to their indexes, and
     * alphabetical if the occurences equal
     */
    public void sort() {
        ArrayList<String> tempAddedWords = new ArrayList<String>();
        ArrayList<Integer> tempOcc = new ArrayList<Integer>();
        boolean wasAdded = false;
        for (int i = 0; i < occurence.size(); i++) {
            wasAdded = false;
            int currOcc = occurence.get(i);
            String currWord = addedWords.get(i);
            for (int y = 0; y < tempAddedWords.size(); y++) {
                wasAdded = false;
                int currTempOcc = tempOcc.get(y);
                if (currOcc > currTempOcc) {
                    tempOcc.add(y, currOcc);
                    tempAddedWords.add(y, currWord);
                    wasAdded = true;
                    break;
                } else if (currOcc == currTempOcc) {
                    if (currWord.compareTo(tempAddedWords.get(y)) < 0) {
                        tempOcc.add(y, currOcc);
                        tempAddedWords.add(y, currWord);
                        wasAdded = true;
                        break;
                    }
                }
            }
            if (!wasAdded) {
                tempAddedWords.add(currWord);
                tempOcc.add(currOcc);
            }
        }
        addedWords = tempAddedWords;
        occurence = tempOcc;
    }

    /**
     * Prints the statistics of the words currently being stored into console in
     * format "word (occurence)"
     */
    public void prinStatistics() {
        for (int i = 0; i < addedWords.size(); i++) {
            System.out.println(addedWords.get(i) + " (" + occurence.get(i) + ")");
        }
    }
}
