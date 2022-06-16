package Chapter4;

import java.util.Scanner;

public class RaisedPower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int number1Counter = number2;
        int number2Counter = number1;
        int square1 = 1;
        int square2 = 1;

        while (number1Counter !=0) {
            square1 = square1 * number1;
            number1Counter--;

        }
        System.out.printf("First number raised to power second number is %d ", square1);


        while(number2Counter != 0) {
            square2 = square2 * number2;
            number2Counter--;
        }
        System.out.printf("%nSecond number raised to power first number is %d ",   square2);
    }
}