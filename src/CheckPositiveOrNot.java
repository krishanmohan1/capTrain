//public class CheckPositiveOrNot {
//    public static void main(String[] args) {
//        int num = 0;
//        String res = num == 0 ? "Neutral Number " : " Not a Neutral No";
//        System.out.println(res);
//    }
//}



public class CheckPositiveOrNot{
    public static void main(String[] args){
//        String ans="A";
//        char ch=ans.charAt(0);
//        System.out.println((ch>='A' && ch<='Z') ? "upercase" : "lowercase");

        String ans="b";
        char ch=ans.charAt(0);
        System.out.println((ch>='A' && ch<='z') || (ch>='a' && ch<='z') ? "Alphabet" : "not alphabet");

    }
}

