package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double annualEarnings = 0;
        double taxDueFromTaxFloor = 0;
        double taxDueFromTaxCeiling = 0;
        String payerName = null;
        double taxFloor = 0.15;
        double taxCeiling = 0.20;
        Scanner keyboardInput = new Scanner(System.in);


        for(int i = 0; i<3; i++){
            System.out.print("Enter tax payer name: " );
            payerName = keyboardInput.nextLine();

            System.out.print("Enter annual income for this tax payee: ");
            annualEarnings = keyboardInput.nextDouble();
            keyboardInput.nextLine();

            if(annualEarnings <= 30_000){
                annualEarnings = annualEarnings - (annualEarnings * taxFloor);
                taxDueFromTaxFloor = annualEarnings * taxFloor;
                System.out.printf("Tax due from tax payer %s per tax floor is %.2f%n", payerName, taxDueFromTaxFloor);
            }

            if(annualEarnings > 30_000){
                double minimumTax = annualEarnings - 30_000;
                taxDueFromTaxFloor = minimumTax * taxFloor;
                taxDueFromTaxCeiling = annualEarnings * taxCeiling;
                System.out.printf("Tax due from tax payer %s per tax floor is %.2f%n", payerName, taxDueFromTaxFloor);
                System.out.printf("Tax due from tax payer %s per tax ceiling is %.2f%n", payerName, taxDueFromTaxCeiling);
            }

        }
    }
}
