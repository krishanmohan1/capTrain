package day24thDec;

import java.util.Scanner;

public class Practice4 {

    public static void task(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press number as : \n 1. -> Area Of rectangle \n2. -> Area Of Square \n3. -> Area Of Circle \n4. -> Area Of Triangle ");
        System.out.print("Enter the shape name  : ");
        String option = sc.nextLine();

        switch (option){
            case "rectangle":
                double areaOfRect = areaOfReactangle();
                System.out.println(areaOfRect);
                System.out.println("Do You want to Continue (yes/no) ");
                String ans = sc.nextLine();
                if(ans.equalsIgnoreCase("yes")){
                    task();
                }else{
                    System.out.println("Ok Bye.." +
                            "" +
                            "");
                    System.exit(0);
                }
                break;

            case "square":
                double areaOfSqua = areaOfSquare();
                System.out.println(areaOfSqua);
                System.out.println("Do You want to Continue (yes/no) ");
                String ans2 = sc.nextLine();
                if(ans2.equalsIgnoreCase("yes")){
                    task();
                }else{
                    System.exit(0);
                }
                break;
            case "circle" :
                double areaOfCir = areaOfCircle();
                System.out.println(areaOfCir);
                System.out.println("Do You want to Continue (yes/no) ");
                String ans3 = sc.nextLine();
                if(ans3.equalsIgnoreCase("yes")){
                    task();
                }else{
                    System.exit(0);
                }
                break;
            case "triangle":
                double areaOfTri = areaOfTriangle();
                System.out.println(areaOfTri);
                System.out.println("Do You want to Continue (yes/no) ");
                String ans4 = sc.nextLine();
                if(ans4.equalsIgnoreCase("yes")){
                    task();
                }else{
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Enter correct option");
        }

    }
    public static void main(String[] args) {
        task();
    }



    public static double areaOfReactangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth: ");
        int breadth = sc.nextInt();
        sc.nextLine();
        return length*breadth;
    }

    public static double areaOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int side = sc.nextInt();
        sc.nextLine();
        return side*side;
    }

    public static double areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = sc.nextInt();
        sc.nextLine();
        return 3.14*radius*radius;
    }

    public static double areaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth: ");
        int breadth = sc.nextInt();
        sc.nextLine();
        return 0.5*length*breadth;
    }

}
