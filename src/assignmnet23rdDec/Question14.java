package assignmnet23rdDec;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start : ");
        int start = sc.nextInt();
        System.out.println("Enter the End : ");
        int end = sc.nextInt();

        for(int i = start; i<=end;i++){
            boolean isFlag = false;
            while(i > 0 && isFlag == false){
                int last = i % 10;
                if(last == 7){
                    isFlag = true;
                    continue;
                }
            }
            System.out.println(i);
        }
    }
}
