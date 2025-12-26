package assignmnet26thDec;

import java.util.Scanner;
/*
    Define a method that accept username and password as parameter and validetes them against
     predefines=d credential. The method should return a status code not booelan

 */

public class LoginAuthenticationSystem {
    public static void main(String[] args) {

        String savedUserName = "krishanmohan1";
        String savedPassWord = "@Chegg1266";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the UserName: ");
        String username = sc.nextLine();

        System.out.print("Enter the passWord: ");
        String password = sc.nextLine();

        int statusCode = authenticate(username, savedUserName,password,savedPassWord);
        displayCode(statusCode);

    }

    public static int authenticate(String username , String savedUserName, String password , String savedPassWord){
        if(username.trim().isEmpty() || password.trim().isEmpty()){
            return 400;     // it is for bad request
        }
        if(!username.equals(savedUserName)){
            return 404;     // if username is wrong (401 or 404)
        }
        if(!password.equals(savedPassWord)){
            return 401;     // when password is not correct(unauthorised)
        }
        return 200;     // it is for success
    }

    public static void displayCode(int code){
        switch (code) {
            case 200:
                System.out.print("Status Code 200: Login SuccessFull! Welcome");
                break;
            case 404:
                System.out.println("Status Code 404: Not Found username does not exit ");
                break;
            case 401:
                System.out.println("Status Code 401: unauthorized. Invalid Password");
                break;
            case 400:
                System.out.println("Status Code 400: Bad Request.Username/Password can't be empty");
                break;
            default:
                System.out.println("Status Code 500: Internal Server Error");
        }
    }

}
