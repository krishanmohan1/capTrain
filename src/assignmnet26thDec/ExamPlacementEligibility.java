package assignmnet26thDec;

import java.util.Scanner;

/*
Create a method that accept marks of three subjects as parameter and return the grades. the calling method shuldj decied where the student is eligible ot not for placement
 */

public class ExamPlacementEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DSA marks (0-100): ");
        int dsa = sc.nextInt();
        System.out.print("Enter JAVA marks (0-100): ");
        int java = sc.nextInt();
        System.out.print("Enter CS Core marks (0-100): ");
        int cs = sc.nextInt();

        int result = checkResult(dsa,java,cs);
        if(result == -1){
            System.out.println("You are not Eligible you have one or more eligible ");
        } else if (result == -2) {
            System.out.println("You are not eligible , you are pass not more than 60%");
        }else {
            char grade = giveGrade(result);
            System.out.println("You have grade "+ grade);
            System.out.println("You are eligible for placement");
        }


    }

    public static int checkResult(int dsa,int java,int cs){

        int miniMarks = 175;
        if(dsa < 33 || java < 33 || cs < 33){
            return -1;
        }else {
            int total = dsa + java + cs;
            if(total < miniMarks){
                return -2;
            }else {
                return total;
            }
        }
    }

    public static char giveGrade(int result){
        if(result > 275){
            return 'A';
        } else if (result > 250 && result <= 275) {
            return 'B';
        } else if (result>225  && result <= 250) {
            return 'C';
        }else {
            return 'D';
        }
    }



}
