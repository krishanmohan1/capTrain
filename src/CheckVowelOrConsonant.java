public class CheckVowelOrConsonant {
    public static void main(String[] args) {

        char vowel = 'a';
        String isVowle = "AEIOU".contains(String.valueOf(vowel)) ? "UpperCase Vowel " : "aeiou".contains(String.valueOf(vowel))?"LowerCase Vowle":"Consonant";
        System.out.println(isVowle);

    }
}
