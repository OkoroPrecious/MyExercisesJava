package Chapter4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter one prime number: " );
        int number = input.nextInt();

        int i = 1;
        int divisors = 0;

        while( i <= number) {
            if (number %i == 0){
                divisors += 1;

            }
            i++;

        }
        if( divisors == 2 ){
            System.out.println("This number is a prime number ");
        }

        else{ System.out.println("This number is an Odd number") ;
        }




    }
}
