package Assignment22thDec;

import java.util.Scanner;

public class CompanyBonusEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Experince Years : ");
        int experienc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the performance rating 1 to 10 : ");
        int performanceRating = sc.nextInt();
        sc.nextLine();

        if(experienc >= 5 && performanceRating >=4){
            System.out.println("You are eligible for bouns ");
        }

    }
}
