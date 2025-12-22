package assignment21thDec;

public class logic1 {
    public static void main(String[] args) {
        String username = "mohan";
        String password = "12344";
        boolean activeStatus = true;

        System.out.println(
                ((!username.isEmpty() && !password.isEmpty()) && activeStatus) ? "You can Login " : "Make reuiremnet fullfill"

        );
    }
}
