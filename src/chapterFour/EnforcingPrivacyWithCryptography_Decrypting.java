package chapterFour;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography_Decrypting {
    public static void main(String[]args){
        int userDigit;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int decryptedNumber;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter four digits to decrypt: ");
            userDigit = input.nextInt();

            digit1 = (userDigit / 1000 + 3) % 10;
            digit2 = (userDigit % 1000 / 100 + 3) % 10;
            digit3 = (userDigit % 100 /10 + 3) % 10;
            digit4 = (userDigit % 10 + 3);
            decryptedNumber = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;

            System.out.printf("The decrypted number is : %d%n", decryptedNumber);

    }
}
