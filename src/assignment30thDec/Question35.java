package assignment30thDec;

import java.util.Scanner;

public class Question35 {

    public static boolean palindrome(int n){
        int ori = n;
        int num = 0;
        while(n > 0){
            int last =  n % 10;
            num = num * 10 + last;
            n/=10;
        }
        return num == ori;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int array[] = new int[sc.nextInt()];

        for (int i=0; i<array.length; i++){
            System.out.print("Element "+ (i+1)+": ");
            array[i] = sc.nextInt();
        }

        for(var e : array){
            if(palindrome(e)){
                System.out.println("This is the palindrome "+ e);
            }
        }






    }
}
