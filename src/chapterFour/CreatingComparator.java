package chapterFour;

import java.util.Scanner;

public class CreatingComparator {
    public static void main(String[]args){
         /*Write an application that works as a comparator. Your program
        should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
        number is greater, and –1 if the second number is greater.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int userNumber1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int userNumber2 = scan.nextInt();

        if(userNumber1 == userNumber2)
            System.out.print("Ans: 0\nYour answer is zero because the first number is = second Number");
        if(userNumber1 > userNumber2)
            System.out.print("Ans: 1\nYour answer is One because the first number is > second Number");
        if(userNumber1 < userNumber2)
            System.out.print("Ans:-1\nYour answer is -1 because the second number is greater than the first Number");

    }
}
