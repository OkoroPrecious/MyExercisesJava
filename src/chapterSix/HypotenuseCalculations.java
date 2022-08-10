package chapterSix;

import java.util.Scanner;

public class HypotenuseCalculations {
        public double Hypotenuse(double side1, double side2){

            double calculateSqr =  Math.pow(side1, 2) + Math.pow(side2, 2);

            return Math.sqrt(calculateSqr);
        }

        public void getHypotenuse(){
            Scanner scan = new Scanner(System.in);
            double side1;
            double side2;
            System.out.println("WELCOME! THIS IS AN APP THAT CALCULATES THE HYPOTENUSE OF A TRIANGLE.");
            System.out.println("Enter side1 of your triangle or enter -1 to exit: ");
                side1 = scan.nextDouble();


            while(side1 > 0){
                System.out.println("Enter side2 of your triangle or enter -1 to exit: ");
                    side2 = scan.nextDouble();

                System.out.printf("The hypotenuse for this triangle is %.3f ",
                       Hypotenuse(side1, side2));

                System.out.println("\nEnter side1 value of your triangle or enter -1 to exit");
                    side1 = scan.nextDouble();
            }
            System.out.println("Please read the instruction and try again");

        }
}
