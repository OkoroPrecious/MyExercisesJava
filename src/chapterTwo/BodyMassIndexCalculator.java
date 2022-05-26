package chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter your height in inches: ");
        double userHeightInInches = keyboardInput.nextDouble();

        System.out.println("Enter your weight in pounds: ");
        double userWeightInPounds = keyboardInput.nextDouble();

        double heightVariable = userHeightInInches * userHeightInInches;
        double weightVariable = userWeightInPounds/ heightVariable;
        double bmi = weightVariable * 703;
        System.out.printf( "%.1f", bmi);


    }
}
