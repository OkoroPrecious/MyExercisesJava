package chapterSix;
import java.util.Scanner;
public class RoundingNumbers {

    public void roundToIntegers(){
       /* Math.floor can be used to round values to the nearest integer—e.g.,
        double y = Math.floor(x + 0.5);
        will round the number x to the nearest integer and assign the result to y. Write an application that
        reads double values and uses the preceding statement to round each of the numbers to the nearest
        integer. For each number processed, display both the original number and the rounded number.
        Scanner scan = new Scanner(System.in);
        double x;
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  decimal number to convert to the nearest integer: ");

            while(input.hasNext()) {
                double x = input.nextDouble();
                double y =  Math.floor( x + 0.5 );

                System.out.printf( "Number: %f\tMath.floor( x + .5 ): %f\n", x ,y );

            }
    }
}
