package assignment1;

public class logic4 {
    public static void main(String[] args) {
        boolean isPremium = true;
        int cart = 4000;
        boolean cartValue = cart > 5000;

        System.out.println(
                isPremium || cartValue ? "Discount Allowed " : "No Discount"
        );
    }
}
