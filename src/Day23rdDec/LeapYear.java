package Day23rdDec;

/*
    Any Year is input by user. write a program to determine whether the year is a leap year or not.
    Leap year are any year that can be evenly divided by 4 . A year that is evenly divisilbe by 100 is a leap year
    year only if it is also evenly divisible by 400;


 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        int year = sc.nextInt();
        sc.nextLine();

        if((year % 400 == 0) || (year % 4==0 && year % 100 != 0)){
            System.out.println("Yes it is a leap year ");
        }else {
            System.out.println("It is not a leap year");
        }
        sc.close();





    }
}
