package chapterSix;

import java.util.Scanner;

import static chapterSix.MaximumFinder.maximum;

public class MaximumFinder_Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating numbers to determine the maximum: ");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double result = maximum(firstNumber,  secondNumber, thirdNumber);
        System.out.println("Maximum number is: " + result);
    }
}
