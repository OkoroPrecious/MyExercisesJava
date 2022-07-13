package chapterThree;

import java.util.Scanner;

public class  CarClassMain {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        Car car = new Car("BENZ ", "1222", 500.0);
        Car car1 = new Car("TOYOTA ", "3333", 600.0);

//        System.out.println("Enter the model of the first car: ");
//        String firstCarName = keyboardInput.nextLine();
//        car.setModel(firstCarName);
//
//        System.out.println("Enter the name of the second car: ");
//        String secondCarName = keyboardInput.nextLine();
//        car1.setModel(secondCarName);

//        System.out.println("Enter the model year of the first car: ");
//        String modelYear = keyboardInput.nextLine();
//        car.setYear(modelYear);
//
//        System.out.println("Enter the model year of the second car: ");
//        String secondModelYear = keyboardInput.nextLine();
//        car1.setYear(secondModelYear);
//
//        System.out.println("Enter the price of the first car: ");
//        double carPrice = keyboardInput.nextDouble();
//        car.setPrice(carPrice);
//
//         System.out.println("Enter the price of second car: ");
//         double secondCarPrice = keyboardInput.nextDouble();
//         car1.setPrice(secondCarPrice);
//
//
//        System.out.println(car);
//        System.out.println(car1);

        double discountMsrpCar1 = 0.05;
        double discountMsrpCar2 = 0.07;

        Double car1Discount = car.getPrice() - (car.getPrice() * discountMsrpCar1);
        Double car2Discount = car1.getPrice() - (car1.getPrice() * discountMsrpCar2);


        System.out.printf("Original price for %s is %.1f , Discount price %.1f\n", car.getModel(), car.getPrice(), car1Discount);
        System.out.printf("Original price for %s is %.1f , Discount price %.1f\n", car1.getModel(), car1.getPrice(), car2Discount);


    }
}
