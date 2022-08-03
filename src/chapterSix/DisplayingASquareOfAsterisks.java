package chapterSix;

import java.util.Scanner;

public class DisplayingASquareOfAsterisks {
      public void display(){
         Scanner input = new Scanner( System.in );

         System.out.print( "Enter square size: " );
         int size = input.nextInt();

         squareOfAsterisks( size );
    }

    public void squareOfAsterisks(int side){

        for ( int count = 1; count <= side * side; count++ ) {
            System.out.print( "*" );

          if ( count % side == 0 )
              System.out.println();

         }

    }
}
