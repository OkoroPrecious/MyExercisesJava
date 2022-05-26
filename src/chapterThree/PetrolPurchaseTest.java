package chapterThree;

public class PetrolPurchaseTest {
    public static void main(String[] args) {

        PetrolPurchase receipt = new PetrolPurchase(null, null, 0, 0.0, 0.0);
        receipt.setStationLocation("Total Filling Station Chemist Bus Stop");
        receipt.setPetrolType("Diesel");
        receipt.setPurchaseQuantity(25);
        receipt.setPricePerLiter(600);
        receipt.setPercentageDiscount(5);
        System.out.println(receipt);


    }
}
