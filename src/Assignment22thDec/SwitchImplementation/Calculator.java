package Assignment22thDec.SwitchImplementation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");
        int t = 4;

            System.out.println("Enter the Operation to Perform : ");
            char operation = sc.next().charAt(0);

            switch (operation){

//                case '+' -> System.out.println(num1 + num2);
//                case '-' -> System.out.println(num1 - num2);
//                case '*' -> System.out.println(num1 * num2);
//                case '/' -> System.out.println(num1 / num2);
                case '+', '-': {
                    System.out.print("Enter the num1 : ");
                    int num1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the num2 : ");
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(num1 + num2);
                    break;
                }

                case '*': {
                    System.out.print("Enter the num1 : ");
                    int num1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the num2 : ");
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(num1 * num2);
                    break;
                }
                case '/': {
                    System.out.print("Enter the num1 : ");
                    int num1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the num2 : ");
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(num1 / num2);
                    break;
                }

            }
        sc.close();


    }
}
