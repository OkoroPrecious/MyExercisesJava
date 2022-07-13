package chapterThree;

import java.util.Scanner;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PetrolPurchase receipt = new PetrolPurchase(null, null, 0, 0.0,
                0.0);

        System.out.println("Enter the name and location of your petrol station: ");
        String userInput = input.nextLine();
        receipt.setStationLocation(userInput);

        System.out.println("Enter petrol type purchased: ");
        String petrolTypeInput = input.nextLine();
        receipt.setPetrolType(petrolTypeInput);

        System.out.println("Enter quantity of petrol purchased: ");
        int quantityPurchased = input.nextInt();
        receipt.setPurchaseQuantity(quantityPurchased);


        System.out.println("Enter price of petrol per litre: ");
        double pricePerLiter = input.nextDouble();
        receipt.setPricePerLiter(pricePerLiter);

        System.out.println("Enter percentage discount: ");
        double percentageDiscount = input.nextDouble();
        receipt.setPercentageDiscount(percentageDiscount);

        System.out.printf("Address: %s\nPetrol Type: %s\nQuantity: %d\nPrice Per Liter: %.2f\nDiscount: %.2f ",
                           receipt.getStationLocation(),receipt.getPetrolType(), receipt.getPurchaseQuantity(),
                           receipt.getPricePerLiter(), receipt.getPercentageDiscount());

        System.out.printf("%nTotal Amount: %.2f", receipt.getPurchaseAmount());

    }

}

