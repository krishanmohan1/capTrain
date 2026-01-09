package assignment30thDec;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int array[] = new int[sc.nextInt()];

        for (int i=0; i<array.length; i++){
            System.out.print("Element "+ (i+1)+": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Printing Odd Index");
        for(int i = 0; i < array.length;i++){
            if(i%2==0) System.out.print(array[i]+" ");
        }
    }
}
