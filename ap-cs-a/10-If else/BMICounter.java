//https://www.javatpoint.com/how-to-round-double-and-float-up-to-two-decimal-places-in-java

import java.util.Scanner;

public class BMICounter {
    public static void main(String[] args) {
        Scanner weightScanner = new Scanner(System.in);
        Scanner heightScanner = new Scanner(System.in);
        System.out.print("What is person's 1 weight? ");
        double weightP1 = weightScanner.nextDouble();
        System.out.print("What is person's 1 height? ");
        double heightP1 = heightScanner.nextDouble();
        double bmiP1 = weightP1/(heightP1*heightP1) * 703;
        //System.out.println(bmiP1);
        System.out.print("What is person's 2 weight? ");
        double weightP2 = weightScanner.nextDouble();
        System.out.print("What is person's 2 height? ");
        double heightP2 = heightScanner.nextDouble();
        double bmiP2 = weightP2/(heightP2*heightP2) *703;
        String weightClassP1 = weightClass(bmiP1);
        String weightClassP2 = weightClass(bmiP2);
        System.out.println("Person 1 BMI = " + bmiP1 + "\n" + weightClassP1);
        System.out.println("Person 2 BMI = " + bmiP2 + "\n" + weightClassP2);
    }

    public static String weightClass(double bmi) {
        String weightClass = "";
        if (bmi < 18.5) {
            weightClass = "underweight";
        }
        else if (bmi < 24.9) {
            weightClass = "normal";
        }
        else if (bmi < 29.9) {
            weightClass = "overweight"; 
        }
        else {
            weightClass = "obese";
        }
        return weightClass;
    }
}
