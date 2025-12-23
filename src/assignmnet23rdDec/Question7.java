package assignmnet23rdDec;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value : ");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the end value : ");
        int end = sc.nextInt();

        long evenProduct = 1;
        long oddProduct = 1;

        for(int i = start; i <= end;i++){
            if(i % 2==0){
                evenProduct *= i;
            }else {
                oddProduct*=i;
            }
        }
        System.out.println("Even product "+ evenProduct);
        System.out.println("Odd product "+oddProduct);


    }
}
