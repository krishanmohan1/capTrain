public class checkAge {
    public static void main(String[] args) {
        int age = 62;
        String ans = (age >= 21 && age <=60) ? "Can go for Date" : age < 21 ? "You are kid" : "You are old bot ";
        System.out.println(ans);
    }
}
