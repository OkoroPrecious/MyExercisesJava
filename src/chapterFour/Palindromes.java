package chapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        boolean numberLength = false;

        while(!numberLength){
            System.out.println("Enter a five digit integer");
            int potentialNumber = keyboardInput.nextInt();
            String inputLength = String.valueOf(potentialNumber);

            if(inputLength.length() < 5 ){
                System.out.println("Incorrect! Enter a valid 5 digit integer");
            } else if (inputLength.length()  == 5) {
                numberLength = true;
               int int1 = potentialNumber/10_000;
               int int2 = potentialNumber%10_000/1000;
               int int3 = potentialNumber%10_000%1000/100;
               int int4 = potentialNumber%10_000%1000%100/10;
               int int5 = potentialNumber%10_000%1000%100%10;

               if(int1 == int5 & int2 == int4){
                   System.out.printf("%d is a palindrome", potentialNumber);
               } else {
                   System.out.printf("%d isn't a palindrome\n", potentialNumber);
               }
            }
        }
    }
}
