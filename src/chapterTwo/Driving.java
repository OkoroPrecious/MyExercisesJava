package chapterTwo;

import java.util.Scanner;

  public class Driving {

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
   
  System.out.println("Enter the driving distance: ");

  double distance = scan.nextDouble();

  System.out.println("Enter miles per gallon:");

  double miles = scan.nextDouble();

  System.out.println("Enter price per gallon: ");
 
  double price = scan.nextDouble();

  double costOfDriving = ( distance * price / miles );

  System.out.println("The cost of driving is " +  costOfDriving);


   }


  }

  

