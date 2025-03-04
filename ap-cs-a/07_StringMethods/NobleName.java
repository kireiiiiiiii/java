import java.util.Scanner;

public class NobleName {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = nameInput.nextLine();
        int divider = name.indexOf(" ");
        String firstNameLC = name.substring(0, divider);
        String firstNameLetter = firstNameLC.substring(0, 1);
        String firstName = firstNameLetter.toUpperCase() + firstNameLC.substring(1);
        String lastNameLC = name.substring(divider);
        String lastName = lastNameLC.toUpperCase();
        System.out.println("Your noble name is " + lastName + " " + firstName);
        nameInput.close();
    }
}
