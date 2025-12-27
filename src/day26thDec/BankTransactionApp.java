package day26thDec;
import java.util.Scanner;
public class BankTransactionApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        long accountBalance = sc.nextLong();

        while (true) {
            showMenu();

            switch (sc.nextInt()) {

                case 1: // Withdraw
                    System.out.print("Enter withdraw amount: ");
                    int withdrawAmount = sc.nextInt();

                    if (withdraw(withdrawAmount, accountBalance)) {
                        accountBalance -= withdrawAmount;
                        System.out.println("Withdrawal Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2: // Deposit
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();

                    System.out.print("Verify Account Number: ");
                    long verifyAcc = sc.nextLong();

                    if (deposit(depositAmount, accountNumber, verifyAcc)) {
                        accountBalance += depositAmount;
                        System.out.println("Deposit Successful");
                    } else {
                        System.out.println("Invalid Account Number");
                    }
                    break;

                case 3: // Display
                    System.out.print("Verify Account Number: ");
                    long verify = sc.nextLong();
                    sc.nextLine(); // consume leftover line

                    System.out.print("Enter IFSC Code: ");
                    String ifsc = sc.nextLine();

                    if (display(accountNumber, verify)) {
                        System.out.println("Account Number: " + accountNumber);
                        System.out.println("Balance: " + accountBalance);
                        System.out.println("IFSC: " + ifsc);
                    } else {
                        System.out.println("Verification Failed");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for banking with us!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    static void showMenu() {
        System.out.println("\n1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Choose option: ");
    }

    static boolean withdraw(int amount, long balance) {
        return amount > 0 && amount <= balance;
    }

    static boolean deposit(int amount, long actualAcc, long enteredAcc) {
        return amount > 0 && actualAcc == enteredAcc;
    }

    static boolean display(long actualAcc, long enteredAcc) {
        return actualAcc == enteredAcc;
    }
}
