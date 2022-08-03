package chapterSix;

import java.util.Scanner;

public class Multiples {

    public boolean isMultiple(int firstNumber, int secondNumber){
        return secondNumber % firstNumber == 0;
    }
    public void calculateMultiple(){
        int firstNumber;
        int secondNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME! THIS IS AN APP THAT VALIDATES  SECOND NUMBER IS A MULTIPLE OF FIRST NUMBER. ");
        System.out.println("Enter first integer number: ");
        firstNumber = scan.nextInt();

        while(firstNumber != 0){
            System.out.println("Enter second integer or press 0 to quit: ");
                    secondNumber = scan.nextInt();
            if(isMultiple(firstNumber,secondNumber))
                System.out.println("True! Second number is a multiple of firstNumber");
            else
                System.out.println("False! Second number is not a multiple of first number");

            System.out.println("Enter first number or press '0' to quit: ");
            firstNumber = scan.nextInt();
        }
        System.out.println("Please read the instruction again.You entered 0, which is the quitting digit.");

    }
}
