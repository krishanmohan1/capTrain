package assignmnet23rdDec;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the Divisor : ");
        int divisor = sc.nextInt();

        for(int i = 1; i <=dividend;i++){
            if(dividend < divisor){
                System.out.println(divisor);
                break;
            }
            if(divisor*i == dividend){
                System.out.println("The remainder is 0");
                break;
            }else if(divisor * i > dividend){
                int remainder = (divisor*i)-dividend;
                System.out.println("remiander is "+ remainder);
                break;
            }
        }
    }
}
