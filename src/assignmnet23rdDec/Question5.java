package assignmnet23rdDec;

import java.util.Scanner;

// WAP to print the even no. between M and N
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter  the end value : ");
        int end = sc.nextInt();
        sc.nextLine();

        for(int i = start; i<= end;i++){
            if(i %2 != 0){
                System.out.print(i+" ");
            }
        }

    }
}
