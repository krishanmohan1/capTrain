package assignment21thDec;

public class logic7 {
    public static void main(String[] args) {
        boolean isPaymentSuccessFull = true;
        boolean isStockAvailable = true;
        boolean isBackOrderAllowed = true;
        System.out.println(
                isPaymentSuccessFull && (isBackOrderAllowed || isStockAvailable) ? "Order is SuccessFull "
                        : !isPaymentSuccessFull ? "Do the payment first " : "tell to make stock or backorder make availabe"
        );
    }
}
