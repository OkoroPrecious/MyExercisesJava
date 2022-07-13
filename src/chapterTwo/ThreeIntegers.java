package chapterTwo;

import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: " );
        int num1 = input.nextInt();

        System.out.print("Enter second integer: " );
        int num2 = input.nextInt();

        System.out.print("Enter third number: " );
        int num3 = input.nextInt();


        int sum = num1 + num2 + num3 ;
        int product = num1 * num2 * num3;
        int average = (sum) / 3;
        int smallest = num1;

        if(num2 <= smallest)
            smallest = num2;

        if(num3 <= smallest)
            smallest = num3;

        int largest = num1;
        if(num2 >= smallest)
            largest = num2;

        if(num3 >= largest)
            largest = num3;

        System.out.printf("sum of the three integers is %d%n ", sum );
        System.out.printf("product of the three integers is %d%n ", product );
        System.out.printf("average of the integers is %d%n ", average );
        System.out.printf("smallest number of the three integers is %d%n ", smallest );
        System.out.printf("largest number of the three integers is %d%n ", largest );

    }
}
