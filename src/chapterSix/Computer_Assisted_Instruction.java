package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_Assisted_Instruction {
    private static void displayQuestion() {
        SecureRandom random = new SecureRandom();

        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        int result = number1 * number2;

        System.out.printf("What is %d x %d ? \n ", number1, number2);
        Scanner user_input = new Scanner(System.in);
        int userAnswer = user_input.nextInt();

        if (userAnswer != 99){
            if (userAnswer != result) {

                System.out.println("No. Please try again.");
                System.out.printf("What is %d x %d ? \n ", number1, number2);

            }else
            {
                System.out.println("Very Good!");
            }
        }
    }




    public static void main(String[] args) {
        displayQuestion();
       // checkAnswer();
    }
}
