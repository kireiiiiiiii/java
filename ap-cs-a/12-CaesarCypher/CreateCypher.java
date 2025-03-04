import java.util.Scanner;

public class CreateCypher {
    public static void main(String[] args) {
        int tab = 3;
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(createCypher2(input, tab));

        console.close();
    }

    public static String createCypher(String input, int tab) {
        char curChar = input.charAt(0);
        int lenght = input.length();
        String output = "";

        for (int currentIndex = 0; currentIndex<lenght; currentIndex++) {
            curChar = input.charAt(currentIndex);
            //defines if character is a letter (lowerCase or upperCase)
            if ((curChar<=122 && curChar<=97) || (curChar<=90 && curChar>=65)) {
                curChar+=tab;
                //checks again
                if ((curChar<=122 && curChar<=97) || (curChar<=90 && curChar>=65)) {
                    curChar-=25;
                }
            }
            output+=curChar;
        }
        return output;
    }

    public static String createCypher2(String input, int tab) {
        String output = "";

        String albhabet = "abcdefghijklmnopqrstuvwxyz";
        int divider = 26 - tab;
        String cypherA = albhabet.substring(divider) + albhabet.substring(0, divider);

        int lenght = input.length();
        int currentIndex = 0;
        String currentLetter = "";
        for (int i = 0; i<lenght; i++) {
            currentLetter = "" + input.charAt(i);
            currentIndex = albhabet.indexOf(currentLetter);
            if (currentIndex != -1) {
                currentLetter = "" + cypherA.charAt(currentIndex);
            }
            output +=currentLetter;
        }
        return output;
    }
}
