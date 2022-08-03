package chapterSix;

import java.util.Scanner;

public class DivisibleBy5 {

    public boolean isDivisible(int number){
        return number % 5 == 0;
    }

    public void Divisible(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer or press 0 to quit: ");
        int number = scan.nextInt();

        while(number > 0){
            if(isDivisible(number))
                System.out.println("True! This number is divisible by 5.");
            else
                System.out.println("False! This number is not divisible by 5.");
            System.out.println("Enter an integer or press 0 to quit: ");
            number = scan.nextInt();
        }
        System.out.println("Quit!");
    }
}
