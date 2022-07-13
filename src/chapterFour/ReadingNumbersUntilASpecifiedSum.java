package chapterFour;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scan.nextInt();

        int sum = 0;

        while(sum != userInput && !(sum > userInput)){
            System.out.print("Enter number: ");
            int nextInput = scan.nextInt();

            sum += nextInput;
            if(sum >= userInput)
                System.out.printf("Sum = %d ", sum);
        }

    }
}
