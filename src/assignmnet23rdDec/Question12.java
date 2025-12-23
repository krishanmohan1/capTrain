package assignmnet23rdDec;
import java.util.Scanner;

public class Question12 {
    static int quotient ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the Divisor : ");
        int divisor = sc.nextInt();

        for(int i = 1; i <= dividend;i++){
            if(divisor*i <= dividend){
                quotient = i;
            }else {
                System.out.println("Quotient is : "+ quotient);
                System.exit(0);
            }
        }
        sc.close();

    }
}
