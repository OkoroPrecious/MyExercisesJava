package chapterTwo;

import java.util.Scanner;

public class ComparingInteger {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter one integer: " );
        int num = input.nextInt();

        int product = num * num ;

        if(num > product) { System.out.printf("%d > %d%n", num,product);
        }

       if (num == product){
            System.out.printf( "%d == %d%n", num, product);
    }
        if (num != product){
            System.out.printf("%d != %d%n", num,product);
        }
        if (num <= product) {
            System.out.printf("%d <= %d%n", num,product);
        }

        if (num > 100){
            System.out.printf("%d > 100", num);
        }

        if (product > 100) {
            System.out.printf("%d > 100", product);
        }

    }

}
