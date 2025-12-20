package assignment1;
/*
A system should send an alert if login attempts exceed 3 and the account is not locked
A movie ticket booking is allowed if seats are available and the user has either a membership or a valid promo code
A band=k transaction is permitted only if the account balance is sufficient and the bank account is active and not frozen
A candidate clears a coding test if they pass the logic round and the coding round , or if they have a strong refferal
A mobile app fetaure is enabled if the user is logged in and has accepted terms ad condition
A system backup runs only when it is midnight and the server load us low or the syatem is in maintaince ode
A student qualifies for placemnet if they have no active backlogs and either a mini CGPA or  intershop experince



 */

public class logic9 {
    public static void main(String[] args) {
        int loginAttemp = 2;
        boolean isAccountLocked = false;
        System.out.println(
                loginAttemp > 3 && !isAccountLocked ? "Send Alert to the user "
                        :"Dont send the alert"
        );

    }
}
