package chapterFour;

import java.util.Scanner;

public class CheckerboardPatternOfAsterisks {
    public static void main(String[]args){

            for(int row = 1; row<= 8; row++) {
                if (row % 2 == 0)
                    System.out.print(" ");
                for (int column = 1; column <= 8; column++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }

    }

}
