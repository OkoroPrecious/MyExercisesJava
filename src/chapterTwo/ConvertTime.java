package chapterTwo;

import java.util.Scanner;
     
       public class  ConvertTime {
            public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    
    
                    System.out.print("Enter the number of minutes:");
                    long min = input.nextLong();

              
                    long y = min/ (365 * 24 * 60);
                    long d = (min% (365 * 24 * 60))/(24 * 60);


                    System.out.printf("%d minutes is %d years and %d days", min, y, d);

        }

    



}                

