package assignmnet26thDec;

import java.util.Scanner;

/*
    Create a paramterised method that accept units consumed and calculates the bill based on slab rates
    Think: how will you handle bounday values?
 */

public class ElectticityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units consumes: ");
        long units = sc.nextLong();
        double price = calculateBill(units);
        System.out.println("You Electricity Bill is : "+price);
    }

    public static double calculateBill(long units){
        int priceUnder100Units = 5;
        int pricePerUnitAfter100To150 = 6;
        int pricePerUnitAfter150To200 = 7;
        int pricePerUnitAfter200= 9;

        double price100Units = 200.0;
        double price150Units = price100Units + 50*6;
        double price200Units = price150Units + 50 * 7;

        double price = 0.0;


        if(units > 0){
            if(units <= 100){
                price = units * 5;
                return price;
            }
            if(units > 100 && units <=150){
                price = price100Units + (units-100)*6;
                return price;
            }
            if(units > 150 && units <= 200){
                price = price150Units + (units-150)*7;
                return price;
            }
            if(units > 200){
                price = price200Units + (units-200)*9;
                return price;
            }
        }else {
            units = -units;
            if(units <= 100){
                price= units * 5;
                return price;
            }
            if(units > 100 && units <=150){
                price= price100Units + (units-100)*6;
                return price;
            }
            if(units > 150 && units <= 200){
                price= price150Units + (units-150)*7;
                return price;
            }
            if(units > 200){
                price= price200Units + (units-200)*9;
                return price;
            }
        }
        return price;
    }

}
