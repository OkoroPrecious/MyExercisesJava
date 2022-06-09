package ChapterSeven;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[] myList = new double[10];
        System.out.println("Enter " + myList.length + " values: ");
        for(int i = 0; i < myList.length; i++ ){
            myList[i] = input.nextDouble();

        }
    }
}
