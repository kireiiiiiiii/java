public class Practice {
    // Write a recursive method sum the first n elements of the Fibonacci sequence.
    // Example (n == 6): 12 (0 + 1 + 1 + 2 + 3 + 5)
    // TIP: Think through on paper FIRST.
    public int nextFibonacciNum(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return nextFibonacciNum(n-1) + nextFibonacciNum(n - 2);
        }
    }

    // Write a recursive method to reverse a string.
    // Example (str.equals("coffee")): "eeffoc“
    // TIP: Think through on paper FIRST.
    public String reverseStr(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return reverseStr(str.substring(1)) + str.substring(0, 1);
        }
    }

    // Write a recursive method to sum all even numbers up to n, inclusive.
    // Example (n == 7): 6+4+2+0 = 12
    public int sumEvens(int n) {
        // TODO: Implement method
        return 0;
    }

    // Write a recursive method that counts the number of characters in a String.
    // Example ('a', "abca"): 2
    public int countChar(char c, String s) {
        if (s.indexOf(c) == -1) {
            return 0;
        }
        else {
            s = s.substring(s.indexOf(c) + 1);
            return countChar(c, s) + 1;
        }
    }

    /*
     * Write a recursive version of the method createString, which prints out an
     * asterisk
     * surrounded by a symmetric set of brackets. Preconditions: n >= 0
     * note: Do not modify createString, but do implement createStringR to have the
     * same behavior,
     * but impliment it with recursion, instead of a loop.
     * Example...
     * input: createStringR(3), output: [[[*]]]
     * input: createStringR(5), output: [[[[[*]]]]]
     * input: createStringR(0), output: *
     */
    public String createString(int n) {
        String prefix = "";
        String postfix = "";
        for (int i = 0; i < n; i++) {
            prefix += "[";
            postfix += "]";
        }
        return prefix + "*" + postfix;
    }

    public String createStringR(int n) {
        // TODO: Replace with recursive implementation
        return "";
    }

    /*
     * Write a method called printBinary that takes an integer and prints out the
     * number
     * in binary (base 2). Your implementation must use recursion.
     * Preconditions: Integer.MAX_VALUE >= n >= 0
     * Examples...
     * input: printBinary(5), output: 0101 (or 101)
     * input: printBinary(201), output: 011001001 (or 11001001)
     */
    // TODO: write the method printBinary
}