package assignmnet23rdDec;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int sum = num;

        for(int i = 1;i<=10;i++){
            System.out.println(num+" * "+i+ " = " + sum);
            sum += num;
        }
        sc.close();

    }
}
