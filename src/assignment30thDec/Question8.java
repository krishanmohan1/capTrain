package assignment30thDec;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int array[] = new int[sc.nextInt()];

        for (int i=0; i<array.length; i++){
            System.out.print("Element "+ (i+1)+": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Element of first half");

        for(int i = 0; i < array.length/2;i++){
            System.out.println(array[i]);
        }
    }
}
