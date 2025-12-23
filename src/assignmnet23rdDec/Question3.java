package assignmnet23rdDec;

import java.util.Scanner;

// WAP to print the alphabet by reading number
public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        if(number >= 1 && number <= 26){
            int ch = 64 + number;
            System.out.println((char)ch);
        }else {
            System.out.println("Number is out of range ");
        }

    }
}
