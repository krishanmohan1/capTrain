package assignment30thDec;

import java.util.Scanner;

public class Question34 {

    public static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2)  return true;
        for(int i = 3; i * i <= n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
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
            if(isPrime(e)){
                System.out.println("this is the prime : "+ e);
            }
        }

    }
}
