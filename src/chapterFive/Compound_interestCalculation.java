package chapterFive;

public class Compound_interestCalculation {
    public static void main(String[]args){

        double principal = 1000.0;
        double interest = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for(int numberOfYears = 1; numberOfYears <= 10; numberOfYears++){
//            a = p (1 + r)^n
//                    where
//            p is the original amount invested (i.e., the principal)
//            r is the annual interest rate (e.g., use 0.05 for 5%)
//            n is the number of years
//            s the amount on deposit at the end of the nth year

            double amount = principal *  Math.pow(1.0 + interest, numberOfYears);
            System.out.printf("%4d%,20.2f%n", numberOfYears, amount);
        }
    }
}
