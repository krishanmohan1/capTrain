package day30thDec;



/*

    Array Syntax:


*/

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        System.out.println();

        double arr1[] = {1,2,3,4,5};
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr1[i] +" ");        // this type of implicitly conversion in possible
        }
        System.out.println();

        int arr2[] = {'A','B','C'};
        for(int i = 0; i < arr2.length;i++){        // here i beloomg to local valriable
            System.out.print(arr2[i]+" ");        // it will tale ascii value
        }

        // Wideninig is allowed in array
    }
}