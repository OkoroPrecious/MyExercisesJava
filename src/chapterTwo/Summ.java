package chapterTwo;

import java.util.Scanner;

  public class Summ {
    
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer: ");
 
  int number1 = input.nextInt();

  System.out.print("Enter second integer: ");

  int number2 = input.nextInt();
  
  int sum = number1 + number2;

  System.out.printf("Sum is %d%n", sum);

  System.out.printf("%d == %d%n", number1, number2);
  
  System.out.printf("%d != %d%n", number1, number2);
 
  System.out.printf("%d < %d%n", number1, number2);

  System.out.printf("%d > %d%n", number2, number1);










     } 


}