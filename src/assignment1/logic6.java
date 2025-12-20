package assignment1;

public class logic6 {
    public static void main(String[] args) {
        int age = 19;
        boolean isBanned = true;
        System.out.println(
                age > 18 && !isBanned
                        ? "You can access application"
                        : age < 18 ? "You are under age of 18 " + (isBanned ? " And you are banned" : "cant use application")
                        : "you are onnly banned"

        );

    }
}
