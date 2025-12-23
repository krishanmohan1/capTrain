package Day23rdDec;

/*
    1. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
    Based on Quantity suppose , one unit will cost 100.
    Judge and price total cost for user.

    2. Enter age , Gender(M/F) and then using following rules print their place of service.
    - if employee is female, then she will work only in urban areas.
    - if employee is a male and age is in between 20-40 then he may work in anywhere.
    - if employee is make and age iin between 40-60 then he will workin urban area only.
    - and any other input of age shoulf print "ERROR"

    3. Leap Year


 */

import java.util.Scanner;

public class CapegiminiPYQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Quantity you purchased: ");
        int quantityPurchased = sc.nextInt();
        sc.nextLine();

        int totalPrice = quantityPurchased * 100;

        if(totalPrice > 1000){
            System.out.println("hey you got 10% discount ");
            double discountedPrice = totalPrice-(totalPrice*0.10);
            System.out.println("Payable amount is : " + discountedPrice);
        }else{
            int butMoreToGetDiscount = 1000-totalPrice;
            System.out.println("Buy More of "+ butMoreToGetDiscount + " to get 10% discount ");
        }
        sc.close();
    }
}
