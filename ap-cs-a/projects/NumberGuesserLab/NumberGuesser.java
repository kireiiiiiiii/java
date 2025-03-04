public class NumberGuesser extends NumberGuesserBase {
    /* Things you can use & how your methods should behave...
     *   Your methods should repeatedly call the parent class method guess(int n)
     *   to guess a number, until a match is found. That method returns...
     *       0 : You are correct (you got it!)
     *      -1 : My number is smaller than your guess
     *       1 : My number is larger than your guess
     * Each of your methods should return the correctly guessed number. */

    /* guessNumberBasic() should be a very simple linear/sequential
     *   guesser (i.e. it should guess 1, 2, 3, ... till it finds it).
     *   This method should not attempt to minimize guesses, it is purely 
     *   a linear / sequential guesser. Keep it simple. */
    public int guessNumberBasic() {
        for (int i = MIN_NUMBER; i <=MAX_NUMBER; i++) {
            if (guess(i) == 0) {
                return i;
            }
        }    
        return -1;
    }

    /* guessNumberFast() should try to guess the number with the minimum
     *   number of guesses. This is the method I will judge you on. 
     *   Unlike the sequential guesser, this method should attempt to 
     *   minimize the number of guesses it takes to guess the answer. */
    public int guessNumberFast() {
        int max = MAX_NUMBER;
        int min = MIN_NUMBER;
        int mid;
        int guessResult;
        while (true) {
            mid = min + (max - min) / 2;
            guessResult = guess(mid);
            if (guessResult == 0) {
                return mid;
            }
            else if (guessResult < 0) {
                max = mid-1;
            }
            else if (guessResult > 0) {
                min = mid + 1;
            }
        }
        //return -1;
    }
}
