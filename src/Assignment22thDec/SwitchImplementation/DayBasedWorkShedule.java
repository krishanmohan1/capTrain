package Assignment22thDec.SwitchImplementation;

import java.util.Scanner;

public class DayBasedWorkShedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day Number : ");
        int number = sc.nextInt();
        sc.nextLine();

        switch (number){
            case 1,2,3,4,5 :{
                System.out.println("It is WeekDay");
                break;
            }
            case 6,7:{
                System.out.println("It is Weekend");
                break;
            }
            default:
                System.out.println("Enter the valid day");
        }
        sc.close();
    }
}
