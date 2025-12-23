package assignmnet23rdDec;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start num : ");
        int start = sc.nextInt();
        System.out.println("Enter the end num : ");
        int end = sc.nextInt();
        int count = 0;
        for(int i = start; i <= end ;i++){
            if(i%7==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Number that are divisible by 7 between "+start+" and "+end+" is "+count);

    }
}
