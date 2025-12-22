package assignment21thDec;

// A movie ticket booking is allowed if seats are available and
// the user has either a membership or a valid promo code



public class logic10 {
    public static void main(String[] args) {
        boolean isSeatAvailabe = true;
        boolean isMemberShipCard = false;
        boolean isValidPromoCode = false;

        System.out.println(
                isSeatAvailabe && (isMemberShipCard || isValidPromoCode) ? "Allowed Booking"
                        : !isSeatAvailabe ? "No seat is Available " : "take membership or valid promo Code"
        );

    }
}
