package Chapter4;

public class FactorialNumber {
    public static void main(String[] args) {
        int p, factorial = 1;
        int number= 3 ;
        for (p=1; p <= number; p++) {
            factorial = factorial * p;
        }
        System.out.println("Factorial of " + number + "is : " + factorial);




    }
}


