package Assignment22thDec;

import java.util.Scanner;

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Working Hours you worked : ");
        int workingHours = sc.nextInt();
        sc.nextLine();

        if(workingHours >= 8){
            System.out.println("You are Marked as Present! ");
        } else if (workingHours < 8 && workingHours >=4 ) {
            System.out.println("You are Marked as Half Day ");
        }else{
            System.out.println("You are marked as Absent ");
        }
        sc.close();

    }
}
