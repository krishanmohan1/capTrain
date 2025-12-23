package assignmnet23rdDec;

// WAP to print product of odd alphabet by using for loop

public class Question2 {
    public static void main(String[] args) {
        for(char ch = 'a';ch <='z';ch++){
            if(ch%2==1) System.out.print(ch+" ");
        }
    }
}
