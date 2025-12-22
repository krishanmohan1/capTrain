package Assignment22thDec;

import java.util.Scanner;

public class ShoppingCartValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is Delivery Address Valid (yes/no)? : ");
        String  isValidAddress = sc.nextLine();

        System.out.print("Is cart is Empty (yes/no)? : ");
        String isCartEmpty = sc.nextLine();

        if(isCartEmpty.equalsIgnoreCase("no") && isValidAddress.equalsIgnoreCase("yes")){
            System.out.println("Process to CheckOut ");
        }else {
            System.out.println("make sure address is valid and cart is not empty ");
        }
        sc.close();

    }
}
