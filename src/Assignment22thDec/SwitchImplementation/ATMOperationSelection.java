package Assignment22thDec.SwitchImplementation;

import java.util.Scanner;

public class ATMOperationSelection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bankBalance = 1000;
        Long accountNumber = 9546942365L;
        int t = 4;

        while (t-- > 0){
            System.out.println("1. -> Withdraw\n2. -> Deposit\n3. -> Balance Enquiry\n4. -> Exit");
            System.out.println("Enter the no. you want to Go: ");
            int selection = sc.nextInt();
            sc.nextLine();

            switch (selection){
                case 1: {
                    System.out.println("Enter the amount to Withdrawl : ");
                    int withdrawlAmount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Account Number : ");
                    long ConfirmAccountNumber = sc.nextLong();
                    sc.nextLine();
                    if((withdrawlAmount> 0 && withdrawlAmount <=  bankBalance ) && (accountNumber == ConfirmAccountNumber)){
                        System.out.println("Withdrawl Amount is : " + withdrawlAmount);
                        int restBalance = bankBalance-withdrawlAmount;
                        System.out.println("Rest Amount is : " + restBalance);
                    } else if (accountNumber != ConfirmAccountNumber) {
                        System.out.println("Enter Correct Account Number");
                    } else {
                        System.out.println("Insufficient Balance ");
                    }
                    break;
                }
                case 2 : {
                    System.out.println("Enter the amount to deposit : ");
                    int depositAmount = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Account Number : ");
                    long ConfirmAccountNumber = sc.nextLong();
                    sc.nextLine();
                    if(depositAmount >0 && accountNumber == ConfirmAccountNumber){
                        bankBalance += depositAmount;
                        System.out.println("Deposit Successfull , You new Balance is "+ bankBalance);
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Enter the Account Number : ");
                    long ConfirmAccountNumber = sc.nextLong();
                    sc.nextLine();
                    if(accountNumber == ConfirmAccountNumber){
                        System.out.println("You bank Balance is "+ bankBalance);
                    }
                    break;
                }
                case 4 : {
                    System.out.println("Exit Your Transaction is SuccessFull ");
                    t = 0;
                    break;
                }
                default:
                    System.out.println("Press the right number!");
            }
            System.out.println("Another transaction , Go ahead !");

        }

        sc.close();
    }
}
