package Chapter_Five;

import java.util.Scanner;

public class Extremes {
    /*5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
    integers and then computes the sum of the two extremes. The user will be prompted to input how
   many values the application should ask the user to input
     */

    public static void main(String[]args) {
       Scanner scanner = new Scanner(System.in);
         int max = 0;
         int min = 999999999;
         int sum;
         int userInput;

        System.out.println("How many values do you want to enter?: ");
        int numberOfValues = scanner.nextInt();

         for(int i=1; i<=numberOfValues; i++){
             System.out.print("Enter integer " + i + ":");
             userInput = scanner.nextInt();

             if (userInput > max) {
                 max = userInput;
             }

             if (userInput < min) {
                 min = userInput;
             }
         }

        System.out.println("the largest number is " + max);
        System.out.println("the smallest number is " + min);

        sum = max + min;
        System.out.println("the sum of the largest and smallest is " + sum);
    }
}
