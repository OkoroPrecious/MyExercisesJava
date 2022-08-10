package Chapter_Five;

public class ModifiedCompoundInterestProgram {
     /* Modify the compound-interest application of
    Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
    vary the interest rate
      */

    public static void main(String[]args){
        double principal = 1000.0;
        double amount;

        for ( int interestRate = 5; interestRate <= 10; interestRate++ ){
            double rate = interestRate / 100.0;
            //header
            System.out.printf( "Interest Rate: %d%%", interestRate );
            System.out.println( "\nYear\tAmount on deposit" );
            for (int year = 1; year <= 10; ++year) {

                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf( "%d\t\t\t%.2f\n", year, amount );

            }
        }
    }
}
