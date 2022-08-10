package chapterTwo;

import java.util.Scanner;
 
public class MonthlySavings{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount:");
        int monthlyAmount = input.nextInt();

        double AccountValueM1 = monthlyAmount * (1 + 0.00417);
        double AccountValueM2 = (monthlyAmount + AccountValueM1) * (1 + 0.00417);
        double AccountValueM3 = (monthlyAmount + AccountValueM2) * (1+ 0.00417);
        double AccountValueM4 = (monthlyAmount + AccountValueM3) * (1+ 0.00417);
        double AccountValueM5 = (monthlyAmount + AccountValueM4) * (1+ 0.00417);
        double AccountValueM6 = (monthlyAmount + AccountValueM5) * (1+ 0.00417);

        System.out.printf("After the sixth month, The account value is $%f ", AccountValueM6);

    }

}

