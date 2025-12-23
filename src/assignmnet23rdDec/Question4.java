package assignmnet23rdDec;

import java.util.Scanner;

// WAP to print the even no. between M and N
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Value: ");
        int M = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the ending Value");
        int N = sc.nextInt();
        sc.nextLine();

        for(int i = M; i <= N; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
