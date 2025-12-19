public class CheckIsAlphabet {
    public static void main(String[] args) {

        // Question
        char ch = 'a';
        String checkAlpha = ((ch >= 65 && ch <= 90) && (ch >= 97 && ch <=122)) ? "Alphabet" : "Not Alphabet";
        System.out.println(checkAlpha);

    }
}
