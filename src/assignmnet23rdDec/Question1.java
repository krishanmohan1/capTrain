package assignmnet23rdDec;

// WAP to print the even alphabet by using for loop
public class Question1 {
    public static void main(String[] args) {

        for(char i = 'a';i<='z';i++){   //-> if you take it in int you have to typecast.
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}
