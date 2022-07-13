package chapterThree;

public class PetrolPurchase {

    private String stationLocation;
    private String petrolType;
    private int purchaseQuantity;
    private double pricePerLiter;
    private double percentageDiscount;


    public PetrolPurchase(String stationLocation, String petrolType, int purchaseQuantity,
                          double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.purchaseQuantity = purchaseQuantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {

        this.percentageDiscount = percentageDiscount / 100;
    }

    public  double getPurchaseAmount() {
        double discountPricePerLiter = pricePerLiter - (pricePerLiter * percentageDiscount);
        return discountPricePerLiter * purchaseQuantity;
    }


}

