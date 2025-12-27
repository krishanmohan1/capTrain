package assignment27thDec;
// A happy number sequence eventually hits 1.
// An unhappy number sequence eventually hits the cycle: 4, 16, 37, 58, 89, 145, 42, 20...
// We can stop if n becomes 1 (happy) or 4 (unhappy).

public class HappyNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (isHappy(i)) {
                count++;
            }
        }
        System.out.println("Number of happy numbers is: " + count);
    }

    public static boolean isHappy(int n) {
        while (n > 9) {
            n = getNext(n);
        }
        return n == 1;
    }

    // Helper method to calculate the sum of squares of digits
    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
