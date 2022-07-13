package chapterTwo;

import java.util.Scanner;

public class TwoInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer: " );
            int x = input.nextInt();

            System.out.print ("Enter second integer: ");
            int y = input.nextInt();

            int product1 = x * x;
            int  product2 = y * y;
            int  sum = x + y;
            int difference = x - y ;

            System.out.printf("product1 is %d",product1 );
            System.out.printf("\nproduct2 is %d", product2);
            System.out.printf("\nsum is %d", sum);
            System.out.printf("\ndifference is %d", difference);

    }
}


