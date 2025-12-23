package Day23rdDec;

/*

2. Enter age , Gender(M/F) and then using following rules print their place of service.
        - if employee is female, then she will work only in urban areas.
        - if employee is a male and age is in between 20-40 then he may work in anywhere.
        - if employee is make and age iin between 40-60 then he will workin urban area only.
        - and any other input of age shoulf print "ERROR"

 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Gender (M/F) : ");
        String gender = String.valueOf(sc.next().charAt(0));
        sc.nextLine();

        if(gender.equalsIgnoreCase("F")){
            System.out.println("You will work in only urban Area");
        }else{
            System.out.print("Enter you age : ");
            int age = sc.nextInt();
            sc.nextLine();

            if(gender.equalsIgnoreCase("M") && (age >=20 && age <=40)){
                System.out.println("You can work anywhere");
            } else if (gender.equalsIgnoreCase("M") && (age >40 && age <=60)){
                System.out.println("You will work in Urban Area Only ");
            }else {
                System.out.println("ERROR!");
            }
        }






    }
}
