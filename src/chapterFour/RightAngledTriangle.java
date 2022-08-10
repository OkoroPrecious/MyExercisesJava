package chapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
      public static void main(String[]args){
                /*4.30 (Right-angled Triangle) Write an application that prompts the user to enter the length of
                the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
                program should work for triangles of base lengths between 1 and 10.
                 */
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the length of the base of a triangle: ");
          int userInput = input.nextInt();

           if(userInput >= 1 && userInput <= 10){
              for(int i = 1; i <= userInput; i++) {
                  for (int j = 1; j <= i; j++)
                       System.out.print("*");
                  System.out.println();
              }

           }
           else
               System.out.print("NUmber entered for base is not within the range of 1 to 10");

      }
}
