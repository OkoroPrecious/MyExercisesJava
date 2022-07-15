package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
      /*A parking garage charges a $2.00 minimum fee to park for up to three hours.The garage charges an
      additional $0.50 per hour for each hour or part thereof in excess of three hours. The maximum charge
      for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time.
      Write an application that calculates and displays the parking charges for each customer who parked
      in the garage yesterday. You should enter the hours parked for each customer.
      The program should display the charge for the current customer and should calculate and
      display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
      the charge for each customer.
       */
      public void startCharging(){
            Scanner scan = new Scanner(System.in);
            double totalReceipt = 0.0; //total fee collected for the day
            double fee; //charge for the current customer
            double hours; //hours for the current customer

            //Read in the first customer hour
            System.out.print("Enter number of hours and -1 to quit: ");
            hours = scan.nextDouble();

            while(hours >= 0.0){
                  fee = calculateCharges(hours);
                  totalReceipt += fee;
                  System.out.printf("Current charge: $%.2f, Total receipts: $%.2f\n", fee, totalReceipt);

                  System.out.print("Enter number of hours and -1 to quit: ");
                  hours = scan.nextDouble();
            }

      }

      public double calculateCharges(double hours){
            double charge = 2.0;
            if(hours > 3.0)
                  charge = 2.0 + 0.5 *Math.ceil(hours-3.0);
            if(charge > 10.0)
                  charge = 10.0;
            return charge;

      }

}
