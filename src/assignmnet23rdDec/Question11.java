package assignmnet23rdDec;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start : ");
        int start = sc.nextInt();
        System.out.println("Enter the end : ");
        int end = sc.nextInt();
        int sum = 0;

        for(int i = start; i <=end;i++){
            if(i%5==0){
                sum +=i;
            }
        }
        System.out.println("Summation is "+ sum);
        sc.close();
    }
}
