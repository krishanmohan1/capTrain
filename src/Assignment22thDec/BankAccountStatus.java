package Assignment22thDec;
import  java.util.Scanner;

public class BankAccountStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minimumBalance = 2000;

        System.out.print("Is this account is flagged : ");
        boolean flagged = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Enter the amount in bank : ");
        int amountPresent = sc.nextInt();
        sc.nextLine();

        if(flagged){
            System.out.println("This is Frozzen ,You can't use it !");
        } else if (amountPresent < minimumBalance ){
            System.out.println("You are Low Balance ");
        }else {
            System.out.println("This account is Active , You can use it .");
        }
        sc.close();
    }
}
