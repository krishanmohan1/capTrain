package day24thDec;

import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        String details =  detailsOfCustomer();
        System.out.println(details);
    }

    public static String detailsOfCustomer(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Mobile : ");
        long contactNumber = sc.nextLong();

        sc.close();

        return " Name is :  "+name+"\n Age is : "+age+"\n Contact number is :  "+contactNumber+"\n Marks is :  "+marks;
    }

}
