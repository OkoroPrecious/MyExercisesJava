package Chapter_Five;

public class IntegersDivisibleBy3 {
    /*Write an application that calculates the sum of those integers
    between 1 and 30 that are divisible by 3
     */
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 31; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum total of integers between 1 and 30 that are divisible by 3 is = "+sum);
    }
}
