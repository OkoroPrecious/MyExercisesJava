package Chapter_Five;

import java.util.Scanner;

public class    BarChartPrintingProgram {
    public static void main(String[]args) {
        /*One interesting application of computers is to display
        graphs and bar charts. Write an application that reads five numbers between 1 and 30.
        For each number that’s read, your program should display the same number
        of adjacent asterisks. For example, if your program reads the number 7,
        it should display *******. Display the bars of asterisks after
        you read all five numbers
         */
        Scanner scan = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;

        int userInput;
        int stars = 0; //Number of stars to print
        int counter = 1;

        while (counter <= 5) {
            System.out.print("Enter 5 numbers within the range of 1 to 30:  ");
            userInput = scan.nextInt();
            if (userInput >= 1 && userInput <= 30) {
                switch (counter) {
                    case 1:
                        number1 = userInput;
                        break;
                    case 2:
                        number2 = userInput;
                        break;
                    case 3:
                        number3 = userInput;
                        break;
                    case 4:
                        number4 = userInput;
                        break;
                    case 5:
                        number5 = userInput;
                        break;
                }
                counter++;

            } else
                System.out.println("invalid input. Number should be between 1 and 30");
        }
        for( counter = 1; counter <= 5; counter++){
                 switch(counter) {
                     case 1:
                         stars = number1;
                         break;
                     case 2:
                         stars = number2;
                         break;
                     case 3:
                         stars = number3;
                         break;
                     case 4:
                         stars = number4;
                         break;
                     case 5:
                         stars = number5;
                         break;

                 }
                 for(int j = 1; j <= stars; j++)
                     System.out.print("*");
                 System.out.println();

        }
    }
}
