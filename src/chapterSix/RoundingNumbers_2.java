package chapterSix;

import java.util.Scanner;

public class RoundingNumbers_2 {
    public void roundingNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number to convert to the nearest integer,tenth,hundredth,thousands: ");
        double x;

        while (input.hasNext()) {

            x = input.nextDouble();

            System.out.printf("Initial number: %f\t  Nearest Integer: %f", x, roundToInteger(x));
            System.out.printf("\nInitial number: %f\t  Nearest 10th: %f", x, roundTo10th(x));
            System.out.printf("\nInitial number: %f\t  Nearest 100th: %f\n", x, roundTo100th(x));
            System.out.printf("Initial number: %f\t  Nearest 1000th :%f ", x, roundTo1000th(x));
        }
    }


        //Methods
        public double roundToInteger(double number){
            return(Math.floor( number + 0.5));
        }

        public double roundTo10th(double number){
        return(Math.floor(number * 10 + 0.5)/10);
        }

        public double roundTo100th(double number){
        return(Math.floor(number * 100 + 0.5)/100);
        }

        public double roundTo1000th(double number){
        return(Math.floor(number *1000 + 0.5) /1000);
        }



}
