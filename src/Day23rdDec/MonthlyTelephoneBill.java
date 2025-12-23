package Day23rdDec;

import java.util.Scanner;

public class MonthlyTelephoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constants for base bills to make the code readable
        double billOf100 = 200.0;
        double billOf150 = billOf100 + (50 * 0.60); // 230.0
        double billOf200 = billOf150 + (50 * 0.50); // 255.0

        System.out.print("Enter the No. of calls: ");
        int callsNumber = sc.nextInt();

        double telephonicBill;

        // Simplified logic: lower bound checks are redundant in else-if
        if (callsNumber <= 100) {
            telephonicBill = billOf100;
        } else if (callsNumber <= 150) {
            telephonicBill = billOf100 + (callsNumber - 100) * 0.60;
        } else if (callsNumber <= 200) {
            telephonicBill = billOf150 + (callsNumber - 150) * 0.50;
        } else {
            telephonicBill = billOf200 + (callsNumber - 200) * 0.40;
        }

        // Print once at the end
        System.out.printf("Total calls: %d%n", callsNumber);
        System.out.printf("Total Telephonic Bill: Rs. %.2f%n", telephonicBill);

        sc.close();
    }
}
