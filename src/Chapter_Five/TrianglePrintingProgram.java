package Chapter_Five;

public class TrianglePrintingProgram {
    public static void main(String[]args){
        int space;


        System.out.print("Triangle A\n");
        //row
        for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) //column

                System.out.print("*");
            System.out.println();
        }
        System.out.println();

        //Triangle B
        System.out.print("Triangle B\n");
        for(int i = 10; i >= 1; i--){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();


        System.out.print("Triangle C\n");
        for(int i = 10; i >= 1; i--){
            for(space = 10; space > i; space--)
                System.out.print(" ");
            for(int j = 1; j<=i; j++ )
                System.out.print("*");
            System.out.println();

        }
        System.out.println();


        System.out.print("Triangle D\n");
        for(int i = 10; i>=1; i--){
            for(space = 1; space < i; space++)
                System.out.print(".");
            for(int j = 10; j>=i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
