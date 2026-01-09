package day30thDec;
import java.util.Arrays;
import  java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];

        int []  arr = new int[sc.nextInt()];


        // it is used to read the element from user
        for(int i= 0; i < arr.length;i++){
            System.out.print("Element "+(i+1)+": " );
            arr[i] = sc.nextInt();
        }
        // it is used to print the element from user
        for(int i= 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // print through the inbild class
        System.out.println(Arrays.toString(arr));       // this Arrays.toString() is static method

    }
}
