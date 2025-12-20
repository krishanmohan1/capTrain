package assignment1;

public class logic3 {
    public static void main(String[] args) {

        String ID = "yes";
        String isPermanent = "yes";
        String isContract = "yes";

        String enterOrNot = ID == "yes " && (isPermanent == "yes" || isContract == "yes") ? "Allowed to Enter " : "Not Allowed to Enter";
        System.out.println(enterOrNot);

    }
}
