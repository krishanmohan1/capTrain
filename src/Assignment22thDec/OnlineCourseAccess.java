package Assignment22thDec;
import java.util.Scanner;

public class OnlineCourseAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the Course Expired (Yes/No)? : ");
        String  isCourseExpired = sc.nextLine();

        System.out.print("Student have ScholarShip (Yes/No)? : ");
        String isScholarShip = sc.nextLine();

        System.out.print("Course is Payed or Not (Yes/No)? : ");
        String isCoursePayed = sc.nextLine();

        if(isCourseExpired.equalsIgnoreCase("Yes")){
            System.out.println("This Course is Expired !");
        }else if(!(isCoursePayed.equalsIgnoreCase("Yes") || isScholarShip.equalsIgnoreCase("Yes"))){
            System.out.println("You need to pay or have ScholarShip");
        }else {
            System.out.println("Yup! you access this Course ");
        }
        sc.close();


    }
}
