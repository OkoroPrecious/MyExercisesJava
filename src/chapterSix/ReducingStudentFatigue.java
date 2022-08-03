package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class ReducingStudentFatigue {
    /* Modify the program of Exercise 6.35 so that various comments are displayed for
    each answer as follows:
    Possible responses to a correct answer:
    Very good!
    Excellent!
    Nice work!
    Keep up the good work!
    Possible responses to an incorrect answer:
    No. Please try again.
    Wrong. Try once more.
    Don't give up!
    No. Keep trying.
    Use random-number generation to choose a number from 1 to 4 that will be used to select
    one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
    issue the responses.
     */


    Random randomNumbers = new Random();
    int answer;

    public void createQuestions() {
        // get two random numbers between 0 and 9
        int digit1 = randomNumbers.nextInt(10);
        int digit2 = randomNumbers.nextInt(10);

        answer = digit1 * digit2;
        System.out.printf("How much is %d times %d?\n", digit1, digit2);

    }

    public void quizQuestions() {
        Scanner input = new Scanner(System.in);
        int guess;
        createQuestions();
        System.out.println("Enter your answer (-1 to exit):");
        guess = input.nextInt();
        while (guess != -1) {
            checkResponse(guess);
            System.out.println("Enter your answer (-1 to exit):");
            guess = input.nextInt();
        }
    }

    public String createResponse(boolean correct) {
        if ( correct )
           switch ( randomNumbers.nextInt( 4 )){
               case 0:
                   return( "Very good!" );
               case 1:
                   return( "Excellent!" );
               case 2:
                   return( "Nice work!" );
               case 3:
                   return( "Keep up the good work!" );
           }

        switch ( randomNumbers.nextInt( 4 )){
           case 0:
               return( "No. Please try again." );
           case 1:
                return( "Wrong. Try once more." );
           case 2:
                return( "Don't give up!" );
           case 3: default:
                return( "No. Keep trying." );
        }

    }

    public void checkResponse(int guess){
        if(guess != answer)
            System.out.println(createResponse(false));
        else
            System.out.println(createResponse(true));
        createQuestions();
    }
}
