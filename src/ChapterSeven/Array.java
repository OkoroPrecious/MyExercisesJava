package ChapterSeven;

import java.util.Scanner;

public class Array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of items: ");
            int n = input.nextInt();
            double[] numbers = new double[n];
            double Sum = 0;

            System.out.println("Enter the numbers: ");
            for(int i = 0; i < n; i++){
                numbers[i] = input.nextDouble();
                Sum += numbers[i];
            }
            double average = Sum/n;
            int count = 0;
            for(int i = 0; i < n; i++)
             if(numbers[i] > average)
              count++;
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);


    }
}
