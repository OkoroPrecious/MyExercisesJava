package chapterFive;

public class For_iteration {
        public static void main(String[]args){
            //for(int counter=1; counter<=10; counter++ )
            int x = 2;
            int y = 10;
            for (int j = x; j <= 4 * x * y; j += y / x){
                // j is 2, j <= 80, increase by 5
                System.out.printf("%d ",j);
            }
            System.out.print("\ncount completed");
        }
}
