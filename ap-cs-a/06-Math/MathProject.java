// Matej Stastny
// 10/20/23

// Demos the creation of simple math methods (pow, sumToN, ...)
public class MathProject {
    // ------------------------------------------------------
    // copares value 'expectedValue' with 'value' if they equal, prints returns "OK"
    // if they dont equal returns "ERROR" and both 'expectedValue' and 'value'
    // method can take both 'string, string' and 'int, int' parameters
    
    public static String test(int expectedValue, int value) {
        if (expectedValue == value) {
            return ""+value;
        }
        else{
            return "ERROR value == " + value + " expected == " + expectedValue;
        }
    }
    public static String test(String expectedValue, String value) {
        if (expectedValue.equals(value)) {
            return "\"" + value + "\"";
        }
        else{
            return "ERROR value == \"" + value + "\" expected == \"" + expectedValue + "\"";
        }
    }

    public static void main(String[] args) {
        System.out.println("pow(2, 3) == " + test(8, pow(2, 3)));

        System.out.println("factorial(3) == " + test(6, factorial(3)));
        System.out.println("factorial(0) == " + test(1, factorial(0)));
    
        System.out.println("sumToN(3) == " + test(6, sumToN(3)));
        System.out.println("sumToN(0) == " + test(0, sumToN(0)));       

        System.out.println("sqrToSum(5) == " + test(55, sumSquares(5)));
        System.out.println("sqrToSum(o) == " + test(0, sumSquares(0)));
        
        System.out.println("strRepeat(\"Neko\", 3) == " + test("NekoNekoNeko", strRepeat("Neko", 3)));
        System.out.println("strRepeat(\"cat\", 0) == " + test("", strRepeat("cat", 0)));
        
        System.out.println("padLeft(\"nya\", 6) == " + test("   nya", padLeft("nya", 6)));
        System.out.println("padLeft(\"nya\", 3) == " + test("nya", padLeft("nya", 3)));
        

        printTableOfSquares(10);


        System.out.println("MathDemo: leaving main()"); 
    }
    
    // ------------------------------------------------------
    // computes 'number' to the 'exponent'  Thus pow(2,3) == 8
    // ‘exponent’ is required to be non-negative integer.  

    public static int pow(int number, int exponent) {
        int powNumber = 1;
        for (int i = 1; i <= exponent; i++) {
            powNumber = powNumber * number;
        }
        return powNumber;
    }
    
    // ------------------------------------------------------
    // computes number! that is number * (number-1) * (number-2) ... 3 * 2 * 1
    // factorial(0) == 1.  

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 0; i < number; i++) {
            factorial = factorial * (number-i);
        }
        return factorial;
    }

    // ------------------------------------------------------
    // computes the sum of all integers from 1 to maxNum inclusive.  
    // Thus sumToN(0) == 0  sumToN(3) == 6

    public static int sumToN(int maxNum) {
        int sum = 0;
        for (int i = 1; i <= maxNum; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
    // ------------------------------------------------------
    // computes the sum of the squares to n (number).   
    // that is N*N + (N-1)*(N-1) ... 3*3 + 2*2 + 1*1

    public static int sumSquares(int number) {
        int returnNum = 0;
        for (int i = number; i > 0; i--) {
            returnNum = returnNum + i*i;
        }
        return returnNum;
    }
    
    // ------------------------------------------------------
    // returns a string that is 'str' repeated 'count' times 
    
    public static String strRepeat(String str, int count) {
        String output = "";
        for (int i = 1; i <= count; i++) {
            output = output + str;
        }
        return output;
    }

    // ------------------------------------------------------
    // returns a string that is input padded with spaces 
    // so that it has a total of 'width' characters
    // Callers should insure that the length of str <= width

    public static String padLeft(String text, int width) {
        int length = width - text.length();
        String pad = "";
        for (int i = 1; i <= length; i++) {
            pad = pad + " ";
        }
        return pad + text;
        
    }
    
    // ------------------------------------------------------
    // print a table of squares that starts at 1 and goes up to and includes maxNumber
    // +-----+-------+
    // |  N  |  N*N  |
    // +-----+-------+
    // |   1 |     1 |
    // |   2 |     4 |
    //      ... omitted ...
    // |  10 |   100 |
    //      ... omitted ...
    // | 100 | 10000 | 
    // +-----+-------+
    // maxNumber*maxNumber < 1000000 and maxNumber < 1000
    // (i.e., maxNumber must be, at most, a 3 digit number.)

    public static void printTableOfSquares(int maxNumber) {
        printLine();
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print("|");
            System.out.print(padLeft(""+i, 4));
            System.out.print(" |");
            System.out.print(padLeft(""+(i*i), 6));
            System.out.println(" |");
        }
        printLine();
        assert(false);   
    }    

    public static void printLine() {
        System.out.print("+");
        for (int i = 1; i <= 5; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 1; i <= 7; i++) { 
            System.out.print("-");
        }
        System.out.println("+");
    }
}  
