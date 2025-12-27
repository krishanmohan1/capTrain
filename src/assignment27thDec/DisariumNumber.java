package assignment27thDec;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int result = disariumNumber(number);
        if(number==result){
            System.out.println("it is disarium Number");
        }else {
            System.out.println("It is not disarium Number");
        }
    }


    public static int disariumNumber(int n){
        int ori = n;
        int sum =0;
        int digitLen= lengthDigit(ori);
        while(n>0){
            int last = n%10;
            sum += powerOfn(last,digitLen);
            digitLen--;
            n/=10;
        }
        return sum;
    }

    public static int lengthDigit(int n){
        int count = 0;
        while(n>0){
            int last = n%10;
            count++;
            n/=10;
        }
        return count;
    }


    public static int powerOfn(int n, int k){
        int prod = 1;
        for(int i= 1;i<=k;i++){
            prod *=n;
        }
        return prod;
    }
}
