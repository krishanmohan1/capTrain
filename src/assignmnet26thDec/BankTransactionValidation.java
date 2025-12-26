package assignmnet26thDec;

import java.util.Scanner;
/*

    Create a parametrized method that accept amount balance and withdraw amount and decides wether
    the transaction can proceed. The method should return a meaningful message intseadrd of printing directly

 */

public class BankTransactionValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  savedPIN = "1266";

        System.out.print("Enter the amount balance : ");
        int amountBalance = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the withdrawl amount : ");
        int withdrawlAmount = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the PIN: ");
        String  pin = sc.nextLine();

        System.out.println("Enter withdraw to withdraw the amount : ");
        String request = sc.nextLine();

        String transactionStatus = withdrawBalance(amountBalance,withdrawlAmount,pin,savedPIN);
        System.out.println("status Of Transaction: "+transactionStatus);

    }

    public  static String withdrawBalance(int amountBalance , int withdrawBalance,String pin, String savedPIN) {
        if (pin.equals(savedPIN)) {
            if(amountBalance<=0){
                return "You have Insufficient Balance";
            } else if (withdrawBalance <= 0 || withdrawBalance > amountBalance){
                return "Enter the valid amount to withdraw";
            }else {
                amountBalance -= withdrawBalance;
                return "Transaction Successfull , remaining balance is : " + amountBalance;
            }
        }else{
            return "Incorect PIN";
        }
    }
}
