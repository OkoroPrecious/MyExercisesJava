package chapterTwo;

import java.util.Scanner;

public class ComputingBMI {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter weightInPounds:");

double weightInPounds = input.nextDouble();

System.out.print("Enter heightInInches:");

double heightInInches = input.nextDouble();

// Convert pounds to kilogram

double weightInKilogram = weightInPounds * 0.45359237 ;

//Convert inches to meters

double heightInMeters = heightInInches * 0.0254;

double BMI = weightInKilogram / (heightInMeters * heightInMeters);

	 System.out.printf("BMI is " + BMI);

    }

  }
   


