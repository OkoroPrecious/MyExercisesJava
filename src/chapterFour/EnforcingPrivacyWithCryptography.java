package chapterFour;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        // ENCRYPTING
        Scanner input = new Scanner(System.in);
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int userNumber;
        int encryptedNumber;


        System.out.print("Enter four digit numbers ");
        userNumber = input.nextInt();
        digit1 = (userNumber / 1000 + 7) % 10; // divide four digit by 1000 to get the first digit and its remainder. Add 7 and divide by 10 which will truncate the remainder. you get the encrypted digit1
        digit2 = (userNumber % 1000 / 100 + 7) % 10; // divide digit by 100
        digit3 = (userNumber % 100 / 10 + 7) % 10;
        digit4 = (userNumber % 10 + 7) % 10;

        encryptedNumber = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;
        System.out.printf("Encrypted number is: %d%n ", encryptedNumber);

    }
}