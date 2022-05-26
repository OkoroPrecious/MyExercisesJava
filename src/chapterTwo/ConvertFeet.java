package chapterTwo;

import java.util.Scanner;
     
       public class ConvertFeet {
            public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    
    
                    System.out.print("Enter a value for feet:");
                    double f = input.nextDouble();
  
                    double m = f * 5.0325;
         
                    System.out.printf("%f feet is  %f meter", f, m);

        }

    



}                

