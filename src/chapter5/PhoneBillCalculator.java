package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    //Initialize what we know
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){

        //Get what we don't know
        double baseCost = getPlanFee();
        double overageMinutes = getoverageMinutes();
        scanner.close();

        double overageCharge = getOverageFee(overageMinutes);
        double taxBilled = getTax(baseCost + overageCharge);


        //Display the itemized bill
        phoneBillStatement(baseCost, taxBilled, overageCharge);
    }

    public static double getPlanFee(){
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int getoverageMinutes(){
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double getTax(double planFee){
        double tax = .15;
        return (planFee * tax);
    }

    public static double getOverageFee(double extraMinutes){
        double minuteOverCost = 0.25;
        return (minuteOverCost * extraMinutes);
    }

    public static void phoneBillStatement(double planFee, double taxBilled, double overageFee){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + taxBilled);
        System.out.println("Total: $" + (planFee + taxBilled + overageFee));
    }
}
