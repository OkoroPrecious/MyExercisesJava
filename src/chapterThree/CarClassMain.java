package chapterThree;

import java.util.Scanner;

public class CarClassMain {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        Car car = new Car("", "", 0.0);
        Car car1 = new Car("", "", 0.0);

        System.out.println("Enter the name of the first car: ");
        String firstCarName = keyboardInput.nextLine();
        car.setModel(firstCarName);

        System.out.println("Enter the name of the second car: ");
        String secondCarName = keyboardInput.nextLine();
        car1.setModel(secondCarName);

        System.out.println("Enter the model year of the first car: ");
        String modelYear = keyboardInput.nextLine();
        car.setYear(modelYear);

        System.out.println("Enter the model year of the second car: ");
        String secondModelYear = keyboardInput.nextLine();
        car1.setYear(secondModelYear);

        System.out.println("Enter the price of the first car: ");
        double carPrice = keyboardInput.nextDouble();
        car.setPrice(carPrice);

        System.out.println("Enter the price of second car: ");
        double secondCarPrice = keyboardInput.nextDouble();
        car1.setPrice(secondCarPrice);

        System.out.println(car);
        System.out.println(car1);

        double discountMsrpCar1 = 0.05;
        double discountMsrpCar2 = 0.07;

        Double car1Discount = car.getPrice() - (car.getPrice() * discountMsrpCar1);
        Double car2Discount = car1.getPrice() - (car1.getPrice() * discountMsrpCar2);

        System.out.printf("Original car1 price %.1f , Discount price %.1f\n", car.getPrice(), car1Discount);
        System.out.printf("Original car2 price %.1f , Discount price %.1f", car1.getPrice(), car2Discount);

    }
}
