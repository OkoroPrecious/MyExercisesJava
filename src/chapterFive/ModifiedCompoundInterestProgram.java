//5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
//Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//vary the interest rate.

package chapterFive;

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (rate = 0.05; rate < 0.10; rate += 0.01) {
            for (int year = 1; year <= 10; ++year) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}