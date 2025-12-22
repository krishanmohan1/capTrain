package Assignment22thDec;

import java.util.Scanner;

public class OnlineCabBookingValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is Location Serviceable (true/false)? ");
        boolean locationServiceable = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Is Driver Available (Yes/No)? ");
        String isDriverAvailable = sc.nextLine();

        System.out.print("Select Payment Mode (Cash/UPI/Card): ");
        String paymentModeSelected = sc.nextLine();

       if (!locationServiceable) {
            System.out.println("Booking Failed: Location is not serviceable.");
        }
        else if (isDriverAvailable.equalsIgnoreCase("No")) {
            System.out.println("Booking Failed: No drivers available at the moment.");
        }
        else if (!(paymentModeSelected.equalsIgnoreCase("Cash") || paymentModeSelected.equalsIgnoreCase("UPI") || paymentModeSelected.equalsIgnoreCase("Card"))) {
            System.out.println("Booking Failed: Invalid or unsupported payment mode.");
        }
        else {
            System.out.println("Success! Your cab is booked.");
        }

        sc.close();
    }
}
