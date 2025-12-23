package Day23rdDec;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int i = 5;
//        while(i>=1){
//            System.out.println(i);
//            i--;
//        }

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int ori = 0;

        while(num > 0){
            int last = num % 10 ;
            ori = ori * 10 + last;
            num /= 10;
        }
        System.out.println("reversed Number : " + ori);




    }
}
