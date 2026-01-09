package assignment30thDec;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int array[] = new int[sc.nextInt()];

        for (int i=0; i<array.length; i++){
            System.out.print("Element "+ (i+1)+": ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < array.length;i++){
            sum+=array[i];
        }
        int average= sum/ array.length;
        System.out.println("Average of element is : "+sum/array.length);
        for(int i = 0; i < array.length;i++){
            if(array[i] == average){
                System.out.println("Average is present at index "+ i);
            }
        }
    }
}
