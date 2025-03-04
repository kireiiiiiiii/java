// TODO - Author, Created Date

// Demos the creation of simple math methods (pow, sumToN, ...)
public class MathProjectDemo {
    public static void main(String[] args) {

        // Add code to exercise (test) each of the methods
        // you have written in this class.

        // Pick good test cases! The test cases should be
        // specific enough to test a variety of inputs,
        // but also simple enough to verify by hand.

        // Be sure to identify the expected output for each
        // test case.

        // For example:
        // System.out.println("pow(2, 3) == " + pow(2, 3));

        // TODO FINISH CALLING ALL METHODS.

        System.out.println("MathDemo: leaving main()");
    }

    // ------------------------------------------------------
    // computes 'num' to the 'exponent' Thus pow(2,3) == 8
    // ‘exponent’ is required to be non-negative integer.

    // TODO implement a power method which takes integers
    // num and exponent as input and returns an integer.

    // ------------------------------------------------------
    // computes n! that is n * (n-1) * (n-2) ... 3 * 2 * 1
    // factorial(0) == 1.

    // TODO implement a factorial method which takes an integer n
    // as input and returns an integer;

    // ------------------------------------------------------
    // computes the sum of all integers from 1 to maxNum inclusive.
    // Thus sumToN(0) == 0 sumToN(3) == 6

    // TODO implement a sumToN method which takes an integer maxNum
    // as input and returns an integer;

    // ------------------------------------------------------
    // computes the sum of the squares to n.
    // that is N*N + (N-1)*(N-1) ... 3*3 + 2*2 + 1*1

    // TODO implement a sumSquares method which takes an integer maxNum
    // as input and returns an integer;

    // ------------------------------------------------------
    // returns a string that is 'str' repeated 'count' times

    // TODO implement a repeat method which takes a String str
    // and integer count as input and returns a string.

    // ------------------------------------------------------
    // returns a string that is 'str' padded with spaces
    // so that it has a total of 'width' characters
    // Callers should insure that the length of str <= width

    // TODO implement a padLeft method which takes a String str
    // and an integer width as input and returns a String.

    // ------------------------------------------------------
    // print a table of squares that starts at 1 and goes up to and includes maxN
    // +-----+-------+
    // | N | N*N |
    // +-----+-------+
    // | 1 | 1 |
    // | 2 | 4 |
    // ... omitted ...
    // | 10 | 100 |
    // ... omitted ...
    // | 100 | 10000 |
    // +-----+-------+
    // You can assert that maxN*maxN < 1000000 and maxN < 1000
    // (i.e., maxN will be, at most, a 3 digit number.)
    public static void printTableOfSquares(int maxN) {
        // TODO Implement.
        // NOTE YOU MUST PAD INTEGERS so that the table looks pretty.
        // Thus you immediately can use your padLeft method.
        assert (false);

        /*
         * (TODO remove this comment before submitting)
         * HINT: To convert an integer to a string use the method
         * Integer.toString(anInteger)
         */
    }
}
