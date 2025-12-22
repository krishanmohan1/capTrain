package Assignment22thDec;

import java.util.Scanner;

public class RailwayTicketConfirmation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is Seats Are Availabe : (yes/no)? ");
        String isSeatsAvailable = sc.nextLine();


        if(isSeatsAvailable.equalsIgnoreCase("no")){
            System.out.println("You have waitlisted Ticket but in RAC is available cancelled Otherwose");
        }else {
            System.out.println("you have confirmed Tickets");
        }

    }
}
