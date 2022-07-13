package chapterFour;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        //a) Write an application that reads a non-negative integer and computes and prints its factorial

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non negative integer: ");
        int userInput = input.nextInt();
        int factorial = 1;

        int i;
        for (i = 1; i <= userInput; i++) {
            factorial = factorial * i;
        }
        System.out.printf("Factorial of %d is : %d ", userInput, factorial);


        int e = 1;

        System.out.print("\nEnter number of terms: ");
        int userNumberOfTerms = input.nextInt();

        for(i = 1; i<=userNumberOfTerms; i++) {
            e = 1 + 1/(e * i);
        }
        System.out.print(e);


        System.out.print("\nEnter no of terms:");
        int mathPow = input.nextInt();
        int ex = (int)Math.pow(mathPow,i);
        while (i<=mathPow){
            e =1+  1/(e *i);
            i++;
        }
        System.out.println(e);
    }
}


