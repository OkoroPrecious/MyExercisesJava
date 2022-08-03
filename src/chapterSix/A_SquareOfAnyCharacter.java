package chapterSix;

import java.util.Scanner;

public class A_SquareOfAnyCharacter {
    public void drawSquare(){
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter square size: " );
        int size = input.nextInt();

        System.out.print( "Enter fill character: " );
        char fillCharacter = input.next().charAt( 0 );

        fillCharacter( size, fillCharacter );
    }

    public void fillCharacter(int side, char fillCharacter){

        for ( int count = 1; count <= side * side; count++ ) {
            System.out.print( fillCharacter );

            if ( count % side == 0 )
                System.out.println();

        }


    }
}
