package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        repeatQ();
    }

    private static void repeatQ(){
        for (int k = 0; k < 9; k++) {
            multiplicationTable();
        }
    }


    private static void multiplicationTable(){
        int end = -1;
        System.out.println("type -1 to quit");
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer =  num1 * num2;
        System.out.println("How much is "+ num1 +" times "+ num2 +"?");
        int input = scanner.nextInt();

        while (input != answer && input != -1){
            System.out.println("Pls try again:");
            System.out.println("How much is "+ num1 +" times "+ num2 +"?");
            input = scanner.nextInt();
            if (input == -1)
                break;
        }

    }


}
