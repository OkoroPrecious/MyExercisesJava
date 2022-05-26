package chapterTwo;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int variable = keyboardInput.nextInt();

        if(variable % 3 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
