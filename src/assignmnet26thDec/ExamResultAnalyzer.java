package assignmnet26thDec;

import java.util.Scanner;

public class ExamResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DSA marks (0-100): ");
        int dsa = sc.nextInt();
        System.out.print("Enter JAVA marks (0-100): ");
        int java = sc.nextInt();
        System.out.print("Enter CS Core marks (0-100): ");
        int cs = sc.nextInt();

        // 1. Get the total marks or an error code
        int result = calculateValidTotal(dsa, java, cs);

        // 2. Handle the output based on the result
        if (result == -1) {
            System.out.println("Result: FAILED (Reason: One or more subjects are below passing marks of 33)");
        } else if (result == -2) {
            System.out.println("Result: FAILED (Reason: Total aggregate is below 60%)");
        } else {
            String finalGrade = determineGrade(result);
            System.out.println("--- Exam Summary ---");
            System.out.println("Total Marks: " + result + "/300");
            System.out.println("Grade: " + finalGrade);
            System.out.println("Status: ELIGIBLE FOR PLACEMENT!");
        }

        sc.close();
    }

    /**
     * Logic: Validates subject scores and aggregate percentage.
     * Returns: Total marks if passed, -1 for subject failure, -2 for aggregate failure.
     */
    public static int calculateValidTotal(int dsa, int java, int cs) {
        // Guard Clause: Check individual subject passing criteria
        if (dsa < 33 || java < 33 || cs < 33) {
            return -1;
        }

        int total = dsa + java + cs;
        int passingAggregate = 180; // 60% of 300

        // Guard Clause: Check aggregate criteria
        if (total < passingAggregate) {
            return -2;
        }

        return total;
    }

    /**
     * Logic: Uses an if-else ladder to handle score ranges.
     * Note: Switch is avoided here because Switch doesn't support ranges (marks > 275).
     */
    public static String determineGrade(int total) {
        if (total >= 275) {
            return "Distinction (A+)";
        } else if (total >= 240) {
            return "First Class (A)";
        } else if (total >= 210) {
            return "Second Class (B)";
        } else {
            return "Pass Class (C)";
        }
    }
}
