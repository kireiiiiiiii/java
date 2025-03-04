import java.util.Scanner;

public class Cryptography {

    // a constant that represents the entire alphabet
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String createCypher(int n) {
        /*
         * --------------
         * createCypher
         * --------------
         * n : int
         * Specifies the seed for our Caesar cypher. We assume that 0 <= n < 26.
         * 
         * returns String
         * Return the Caesar cypher we create by "shifting" the alphabet over n times to
         * the right.
         * --------------
         * Examples:
         * n = 1
         * >> zabc...vwxy (alphabet shifted over to the right 1 time)
         * 
         * n = 25
         * >> bcde...xyza (alphabet shifted over to the right 25 times)
         */

        // your code here:
        int divider = 26 - n;
        return ALPHABET.substring(divider) + ALPHABET.substring(0, divider);
    }

    public static char encryptChar(String cypher, char c) {
        /*
         * --------------
         * encryptChar
         * --------------
         * cypher : String
         * Our cypher, a string with 26 lower-case characters that shuffle the order of
         * the alphabet.
         * c : char
         * The character we want to encrypt. We assume that c is lower-case.
         * 
         * returns char
         * Returns the encrypted character using our cypher.
         * --------------
         * Example:
         * c = a
         * cypher = bcde...xyza
         * >> b
         */

        // your code here:
        int index = ALPHABET.indexOf(c);
        if (index != -1) {
            c = cypher.charAt(index);
        }
        return c;
    }

    public static String encryptString(String cypher, String input) {
        /*
         * --------------
         * encryptString
         * --------------
         * cypher : String
         * Our cypher, a string with 26 lower-case characters that shuffle the order of
         * the alphabet.
         * input : String
         * The message that we want to encrypt.
         * 
         * returns String
         * Returns the encrypted message using our cypher.
         * --------------
         */

        // your code here:
        int length = input.length();
        String output = "";
        for (int index = 0; index < length; index++) {
            output += encryptChar(cypher, input.charAt(index));
        }
        return output;
    }

    public static char decryptChar(String cypher, char c) {
        /*
         * --------------
         * decryptChar
         * --------------
         * cypher : String
         * Our cypher, a string with 26 lower-case characters that shuffle the order of
         * the alphabet.
         * c : char
         * The character we want to decrypt. We assume that c is lower-case.
         * 
         * returns char
         * Returns the decrypted character using our cypher.
         * --------------
         * Example:
         * c = a
         * cypher = bcde...xyza
         * >> z
         */

        // your code here:
        int index = cypher.indexOf(c);
        if (index != -1) {
            c = ALPHABET.charAt(index);
        }
        return c;
    }

    public static String decryptString(String cypher, String input) {
        /*
         * --------------
         * decryptString
         * --------------
         * cypher : String
         * Our cypher, a string with 26 lower-case characters that shuffle the order of
         * the alphabet.
         * input : String
         * The message that we want to decrypt.
         * 
         * returns String
         * Returns the decrypted message using our cypher.
         * --------------
         */

        // your code here:
        int length = input.length();
        String output = "";
        for (int index = 0; index < length; index++) {
            output += decryptChar(cypher, input.charAt(index));
        }
        return output;
    }

    // ------------------------------------------------------------------------
    // YOU DO NOT NEED TO EDIT, READ, OR WORRY ABOUT THE REST OF THE CODE!!!
    //
    // You are completely welcome to take a look! You will probably
    // be pleased to see that you can understand a good amount of it!
    // But really, the heart of this entire program is the code that you
    // will write above :)
    // ------------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        printWelcomeMessage();
        interactiveProgramConsole(console);

        console.close();
        // System.out.println(Cryptography.createCypher(2));
    }

    public static void interactiveProgramConsole(Scanner console) {
        System.out.println("Please type your selection below:");
        String input = console.nextLine().trim();
        while (true) {
            if (input.equals("1") || input.equals("e") || input.equals("encrypt")) {
                String cypher = interactiveCreateCypher(console);
                interactiveEncrypt(console, cypher);
                break;
            } else if (input.equals("2") || input.equals("d") || input.equals("decrypt")) {
                String cypher = interactiveCreateCypher(console);
                interactiveDecrypt(console, cypher);
                break;
            } else if (input.equals("3") || input.equals("createCypher")) {
                testCreateCypher();
                break;
            } else if (input.equals("4") || input.equals("encryptChar")) {
                testEncryptChar();
                break;
            } else if (input.equals("5") || input.equals("encryptString")) {
                testEncryptString();
                break;
            } else if (input.equals("6") || input.equals("decryptChar")) {
                testDecryptChar();
                break;
            } else if (input.equals("7") || input.equals("decryptString")) {
                testDecryptString();
                break;
            } else if (input.equals("8") || input.equals("testAll")) {
                testCreateCypher();
                testEncryptChar();
                testEncryptString();
                testDecryptChar();
                testDecryptString();
                break;
            } else {
                System.out.println("Your selection is invalid. Please re-type your selection below:");
                input = console.nextLine().trim();
            }
        }
    }

    public static String interactiveCreateCypher(Scanner console) {
        System.out.println("In order to get started, we first need to create a cypher!");
        System.out.println("Please input an integer number between 0 and 26 in order to create your cypher:");
        int n = console.nextInt();
        console.nextLine(); // nextInt doesn't read newline character
        while (n < 0 || n >= 26) {
            System.out.println(
                    "Your chosen number " + n + " is out of bounds. Please re-type a number between 0 and 26.");
            n = console.nextInt();
            console.nextLine(); // nextInt doesn't read newline character
        }
        String cypher = createCypher(n);
        System.out.println("Cypher created!");
        System.out.println();
        return cypher;
    }

    public static void interactiveDecrypt(Scanner console, String cypher) {
        System.out.println("Let's find out what the secret message says!");
        System.out.println("Please type your message below:");
        String input = console.nextLine().trim();
        while (!(input.equals("q") || input.equals("quit") || input.equals(""))) {
            String decrypted = decryptString(cypher, input);
            System.out.println("Here is your decrypted message:");
            System.out.println(decrypted);
            System.out.println();
            System.out.println("Let's decrypt another message!");
            System.out.println("Type in your message below; type q, quit, or press the Enter key to exit.");
            input = console.nextLine().trim();
        }
    }

    public static void interactiveEncrypt(Scanner console, String cypher) {
        System.out.println("Let's send your message in secret!");
        System.out.println("Please type your message below:");
        String input = console.nextLine().trim();
        while (!(input.equals("q") || input.equals("quit") || input.equals(""))) {
            String encrypted = encryptString(cypher, input);
            System.out.println("Here is your encrypted message:");
            System.out.println(encrypted);
            System.out.println();
            System.out.println("Let's encrypt another message!");
            System.out.println("Type in your message below; type q, quit, or press the Enter key to exit.");
            input = console.nextLine().trim();
        }
    }

    public static void printWelcomeMessage() {
        System.out.println("----------------------------------------------------------");
        System.out.println("|\t\tWELCOME TO OUR CYPHER PROGRAM!\t\t|");
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Please choose one of the options below to get started:");
        System.out.println("1. Encrypt a message (type 1, e, or encrypt).");
        System.out.println("2. Decrypt a message (type 2, d, or decrypt).");
        System.out.println("3. Test your createCypher method (type 3, or createCypher).");
        System.out.println("4. Test your encryptChar method (type 4, or encryptChar).");
        System.out.println("5. Test your encryptString method (type 5, or encryptString).");
        System.out.println("6. Test your decryptChar method (type 6, or decryptChar).");
        System.out.println("7. Test your decryptString method (type 7, or decryptString).");
        System.out.println("8. Test all (type 8 or testAll)");
    }

    public static void testCreateCypher() {
        System.out.println("Testing createCypher method...");

        // first off, if we don't shift the alphabet, it shouldn't change!
        int n = 0;
        String expectedSolution = ALPHABET;
        assert (expectedSolution.equals(createCypher(n))) : "Testing createCypher with n = 0";

        // test the examples from out handout
        n = 1;
        expectedSolution = "zabcdefghijklmnopqrstuvwxy";
        assert (expectedSolution.equals(createCypher(n))) : "Testing createCypher with n = 1";

        n = 4;
        expectedSolution = "wxyzabcdefghijklmnopqrstuv";
        assert (expectedSolution.equals(createCypher(n))) : "Testing createCypher with n = 4";

        n = 25;
        expectedSolution = "bcdefghijklmnopqrstuvwxyza";
        assert (expectedSolution.equals(createCypher(n))) : "Testing createCypher with n = 25";

        System.out.println("Fantastic! All tests passed!");
    }

    public static void testEncryptChar() {
        System.out.println("Testing encryptChar method...");

        // create a short cypher with letters shifted by 1
        String cypher = "bcd";
        assert (encryptChar(cypher, 'a') == 'b') : "Testing encryptChar shifted by 1 letter from a";
        assert (encryptChar(cypher, 'b') == 'c') : "Testing encryptChar shifted by 1 letter from b";
        assert (encryptChar(cypher, 'c') == 'd') : "Testing encryptChar shifted by 1 letter from c";

        // now test a new cypher shifted by 4
        cypher = "efg";
        assert (encryptChar(cypher, 'a') == 'e') : "Testing encryptChar shifted by 4 letters from a";
        assert (encryptChar(cypher, 'b') == 'f') : "Testing encryptChar shifted by 4 letters from b";
        assert (encryptChar(cypher, 'c') == 'g') : "Testing encryptChar shifted by 4 letters from c";

        // lastly, test a cypher shifted by 24 (so letters wrap around!)
        cypher = "yza";
        assert (encryptChar(cypher, 'a') == 'y') : "Testing encryptChar shifted by 24 letters from a";
        assert (encryptChar(cypher, 'b') == 'z') : "Testing encryptChar shifted by 24 letters from b";
        assert (encryptChar(cypher, 'c') == 'a') : "Testing encryptChar shifted by 24 letters from c";

        System.out.println("Phenomenal! All tests passed!");
    }

    public static void testEncryptString() {
        System.out.println("Testing encryptString method...");

        // for this one, we'll try a clever idea: if we encrypt the alphabet using our
        // cypher,
        // we should get back our cypher!

        // for ease of reading, we'll use a shortened version of our alphabet and
        // cyphers here
        String shortAlphabet = "abcdefghij";

        // create a short cypher with letters shifted by 1
        String cypher = "bcdefghija";
        assert (encryptString(cypher, shortAlphabet).equals(cypher)) : "Testing encryptString shifted by 1 letter";

        // now test a new cypher shifted by 4
        cypher = "efghijabcd";
        assert (encryptString(cypher, shortAlphabet).equals(cypher)) : "Testing encryptString shifted by 4 letters";

        // lastly, test a cypher shifted by 9 (so letters wrap around!)
        cypher = "jabcdefghi";
        assert (encryptString(cypher, shortAlphabet).equals(cypher)) : "Testing encryptString shifted by 9 letters";

        System.out.println("Tremendous! All tests passed!");
    }

    public static void testDecryptChar() {
        System.out.println("Testing decryptChar method...");

        // decryption is just the opposite of encryption, so we can take our
        // tests for encryptChar and swap around the input and output letters!

        // create a short cypher with letters shifted by 1
        String cypher = "bcd";
        assert (decryptChar(cypher, 'b') == 'a') : "Testing encryption shifted by 1 letter from a";
        assert (decryptChar(cypher, 'c') == 'b') : "Testing encryption shifted by 1 letter from b";
        assert (decryptChar(cypher, 'd') == 'c') : "Testing encryption shifted by 1 letter from c";

        // now test a new cypher shifted by 4
        cypher = "efg";
        assert (decryptChar(cypher, 'e') == 'a') : "Testing encryption shifted by 4 letters from a";
        assert (decryptChar(cypher, 'f') == 'b') : "Testing encryption shifted by 4 letters from b";
        assert (decryptChar(cypher, 'g') == 'c') : "Testing encryption shifted by 4 letters from c";

        // lastly, test a cypher shifted by 24 (so letters wrap around!)
        cypher = "yza";
        assert (decryptChar(cypher, 'y') == 'a') : "Testing encryption shifted by 24 letters from a";
        assert (decryptChar(cypher, 'z') == 'b') : "Testing encryption shifted by 24 letters from b";
        assert (decryptChar(cypher, 'a') == 'c') : "Testing encryption shifted by 24 letters from c";

        System.out.println("Astounding! All tests passed!");
    }

    public static void testDecryptString() {
        System.out.println("Testing decryptString method...");

        // decryption is just the opposite of encryption, so we can take our
        // tests for encryptString and swap around the input and output! That is,
        // if we decrypt the cypher with itself, we should get back the original
        // alphabet!

        // for ease of reading, we'll use a shortened version of our alphabet and
        // cyphers here
        String shortAlphabet = "abcdefghij";

        // create a short cypher with letters shifted by 1
        String cypher = "bcdefghija";
        assert (decryptString(cypher, cypher).equals(shortAlphabet)) : "Testing encryptString shifted by 1 letter";

        // now test a new cypher shifted by 4
        cypher = "efghijabcd";
        assert (decryptString(cypher, cypher).equals(shortAlphabet)) : "Testing encryptString shifted by 4 letters";

        // lastly, test a cypher shifted by 9 (so letters wrap around!)
        cypher = "jabcdefghi";
        assert (decryptString(cypher, cypher).equals(shortAlphabet)) : "Testing encryptString shifted by 9 letters";

        System.out.println("Splendid! All tests passed!");
    }

}
