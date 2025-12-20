package assignment1;

//A band=k transaction is permitted only
// if the account balance is sufficient and the bank account is active and not frozen


public class logic11 {
    public static void main(String[] args) {

        int balance = 5000;
        int  amount = 10000;
        boolean isActive = true;
        boolean isfrozen = true;

        System.out.println(

                (amount <= balance && isActive && !isfrozen) ? "Transaction is not Allowed"
                        : amount > balance ? "InSufficient Balance" : !isActive ? "Account is not active " : "Account is Frozen"

        );


    }
}
