package Assignment22thDec;

import java.util.Scanner;

public class ExamsResultClassification {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);



        int t = 3;  // this is how many time you take this test case

        while (t-- > 0){
            System.out.print("Enter the marks : ");
            int marks = sc.nextInt();
            sc.nextLine();
            if(marks < 40 ){
                System.out.println("Sorry you are fail the exam ");
            }else if(marks >= 80){
                System.out.println("You are pass and hav grade A ");
            } else if (marks > 60 && marks <= 79) {
                System.out.println("You are and have Grade B");
            }else {
                System.out.println("you are passed ");
            }

        }
        sc.close();


    }
}
