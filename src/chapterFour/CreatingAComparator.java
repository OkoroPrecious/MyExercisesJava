package chapterFour;

import java.util.Scanner;

public class CreatingAComparator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter 2 variables: ");
        int a = keyboardInput.nextInt();
        int b = keyboardInput.nextInt();

        comparator(a, b);
        System.out.println(comparatorWReturn(a, b));
    }

    private static void comparator(int a, int b) {
       if(a == b){
           System.out.println(0);
       }

       if(a > b){
           System.out.println(1);
       }

        if(b > a){
            System.out.println(-1);
        }
    }

    private static int comparatorWReturn(int a, int b){
        if(a == b){
            return 0;
        }

        if(a > b){
            return 1;
        }

        if(b > a){
            return -1;
        }
        return 0;
    }
}
