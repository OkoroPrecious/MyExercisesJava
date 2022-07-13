package Chapter_Five;

public class TheSumOfaSeries {
/*Find the summation of the sequence of numbers 1, 2, 3 … n, where
   n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and
   the corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
   with the variable that accumulates the product?
 */
    public static void main(String[]args) {
        long sum = 0;

        System.out.print("NUMBER\t\tSUM\n");

        for (int i = 1; i < 101; i++) {
            //System.out.println(i);
            sum += i;
             System.out.printf("%3d\t\t%6d%n",i , sum );

        }

        /* \t is tab space. A tap of tab gives 4spaces and 2tabs gives 8 spaces between Number and Sum
           %3d format specifier for int and the number 3 indicates the number of spaces to the right
           %6d format specifier for int and the number 3 indicates the number of spaces to the right
           %n is for next line.

         */

    }
}
