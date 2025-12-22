package Assignment22thDec.SwitchImplementation;
import java.util.Scanner;
public class MovieRatingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int savedMobileNo = 95;

        System.out.println("Enter the mobile No.");
        int mobileNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the movie name : ");
        String movieName = sc.nextLine();

        System.out.println("Enter the rating (1-5) : ");
        int rating = sc.nextInt();
        sc.nextLine();

        switch (rating){
            case 1 : {
                if(mobileNumber == savedMobileNo){
                    System.out.println("Rating of " + movieName +" Poor" + " with raiting " + rating);
                }
                break;
            }
            case 2 : {
                if(mobileNumber == savedMobileNo){
                    System.out.println("Rating of " + movieName +" Average" + " with raiting " + rating);
                }
                break;
            }
            case 3 : {
                if(mobileNumber == savedMobileNo){
                    System.out.println("Rating of " + movieName +" Good" + " with raiting " + rating);
                }
                break;
            }
            case 4 : {
                if(mobileNumber == savedMobileNo){
                    System.out.println("Rating of " + movieName +" Excellent " + " with raiting " + rating);
                }
                break;
            }
            default:
                System.out.println("Enter the rating between 1 to 5");

        }
        sc.close();

    }
}
