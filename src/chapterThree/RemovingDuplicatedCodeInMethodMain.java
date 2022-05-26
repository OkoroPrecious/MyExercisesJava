package chapterThree;

import java.util.Scanner;

public class RemovingDuplicatedCodeInMethodMain {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        account1.displayAccount(account1);
        account2.displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1 and Account 2: ");
        double depositAmount1 = input.nextDouble();
        double depositAmount2 = input.nextDouble();

        System.out.printf("%nadding %.2f %.2f to account balance %n%n", depositAmount1, depositAmount2);
        account1.deposit(depositAmount1);
        account2.deposit(depositAmount2);

        account1.displayAccount(account1);
        account2.displayAccount(account2);

        account1.withdraw(20);
        account2.withdraw(20);

        account1.displayAccount(account1);
        account2.displayAccount(account2);
    }


}
