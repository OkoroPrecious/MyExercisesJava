package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstructions {
       /* (Computer-Assisted Instruction) The use of computers in education is referred to as
       computer-assisted instruction (CAI). Write a program that will help an elementary school
       student learn multiplication. Use a SecureRandom object to produce two positive one-digit integers.
       The program should then prompt the user with a question, such as
       How much is 6 times 7?
       The student then inputs the answer. Next, the program checks the student’s answer.
       If it’s correct,display the message "Very good!" and ask another multiplication question.
       If the answer is wrong display the message "No. Please try again." and let the student try
       the same question repeatedly until the student finally gets it right.
       A separate method should be used to generate each new question.
       This method should be called once when the application begins execution and each time the
        user answers the question correctly.
        */
            Random randomNumbers = new Random();
        int answer;

        // ask the user to answer multiplication problems
        public void quiz() {
            Scanner input = new Scanner(System.in);

            int guess;
            createQuestion();

            System.out.println( "Enter your answer (-1 to exit):" );
            guess = input.nextInt();
            while ( guess != -1 ) {
                checkResponse( guess );
                System.out.println( "Enter your answer (-1 to exit):" );
                guess = input.nextInt();
            }
        }

         // prints a new question and stores the corresponding answer
        public void createQuestion() {
         // get two random numbers between 0 and 9
            int digit1 = randomNumbers.nextInt( 10 );
            int digit2 = randomNumbers.nextInt( 10 );

             answer = digit1 * digit2;
             System.out.printf( "How much is %d times %d?\n", digit1, digit2 );
        }

         public void checkResponse( int guess ) {
            if ( guess != answer )
                System.out.println( "No. Please try again." );
            else {
                System.out.println( "Very Good!" );
                 createQuestion();
            }
         }
}

