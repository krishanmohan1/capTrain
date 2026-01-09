package assignment30thDec;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first array size : ");
        int arr1[] = new int[sc.nextInt()];

        for (int i=0; i<arr1.length; i++){
            System.out.print("Element arr1 "+ (i+1)+": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second array  size : ");
        System.out.println();

        int arr2[] = new int[sc.nextInt()];

        for (int i=0; i<arr2.length; i++){
            System.out.print("Element arr2 "+ (i+1)+": ");
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[arr1.length+arr2.length];

        int j = 0;
        for(int i =0; i < arr1.length;i++){
            merge[j++]=arr1[i];
        }
        for (int k = 0; k < arr2.length;k++){
            merge[j++] = arr2[k];
        }

        System.out.println(Arrays.toString(merge));




    }
}
