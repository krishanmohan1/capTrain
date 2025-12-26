package day24thDec;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the opertion");
//        String operation = sc.nextLine();
//        if(operation.equalsIgnoreCase("sum")){
//            sum();
//        } else if (operation.equalsIgnoreCase("sub")) {
//            substraction();
//        }else {
//            multiplication();
//        }
//        sc.close();
        sum();
        substraction();
        multiplication();


    }

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Num : ");
        int num2 = sc.nextInt();
        System.out.println(num2 + num1);
        sc.close();
    }

    public static void substraction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Num : ");
        int num2 = sc.nextInt();
        System.out.println(num1-num2);
        sc.close();
    }

    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Num : ");
        int num2 = sc.nextInt();
        System.out.println(num2 * num1);
        sc.close();
    }

}
