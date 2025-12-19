public class CheckAlphabetVowlesOrConsonant {
    public static void main(String[] args) {

        char vowel = 'A';
        String res = "aeiouAEIOU".contains(String.valueOf(vowel))? "Alphabet Vowles " : "Consonant";
        System.out.println(res);

    }
}
