package assignment30thDec;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int array[] = new int[sc.nextInt()];

        for (int i=0; i<array.length; i++){
            System.out.print("Element "+ (i+1)+": ");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("max element : "+max);
    }
}
