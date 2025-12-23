package assignmnet23rdDec;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value : ");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the end value : ");
        int end = sc.nextInt();
        sc.nextLine();
        int evenSum = 0;
        int oddSum = 0;

        for(int i = start; i <= end;i++){
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("Even Sum "+ evenSum);
        System.out.print("Odd Sum "+ oddSum);
    }

}
