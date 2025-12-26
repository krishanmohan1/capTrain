package assignmnet26thDec;

import java.util.Scanner;

/*

    To build a better logic for this "Discount Engine," you should focus on Mathematical Accuracy, Input Safety, and Logical Branching.
Currently, your code has a mathematical error: it adds 10% to the price instead of subtracting it.
Here is how to refine your thinking process for this task:
1. The Mathematical Logic (Subtraction vs. Addition)
A discount reduces the price.
Wrong Math: purchaseAmount + (0.10 * purchaseAmount) (This is a tax or a markup).
Right Math: purchaseAmount - (0.10 * purchaseAmount) (This is a discount).
Cleaner Math: purchaseAmount * 0.90 (Paying 90% of the price is the same as a 10% discount).
2. Handling "Unknown" Customer Types
In your current code, if a user types "Alien" or "Guest," the else block automatically gives them the Premium discount.
The Thinking Fix: You should check for Premium explicitly. If the input is neither Regular nor Premium, you should treat them as a "General" customer with 0% discount.
3. Separation of Data and Formatting
Your method returns a long sentence (String). In a real application, a "Discount Engine" should return the calculated number (double).
The Thinking Fix: Let the method do the math and return the final price. Let the main method (the UI) handle the printing of "Welcome" messages.
4. Logical Flow (The "Guard Clause" Approach)
Instead of nesting if inside if, handle errors first and exit early:
Check for invalid money: (Amount < 0) -> Return error.
Determine the percentage: Check type and pick 0%, 10%, or 15%.
Apply Math: Calculate final price.
Return: Send the final number back.
Improved Logic Structure
Look at how this structure is much easier to read and maintain:
java
public static double calculateFinalPrice(int amount, String type) {
    double discountPercent = 0.0;

    // 1. Identify the discount rate based on type
    if (type.equalsIgnoreCase("regular")) {
        discountPercent = 0.10;
    } else if (type.equalsIgnoreCase("premium")) {
        discountPercent = 0.15;
    }
    // No 'else' needed; discount stays 0.0 for others

    // 2. Calculate the discount value
    double discountAmount = amount * discountPercent;

    // 3. Subtract and return
    return amount - discountAmount;
}
Use code with caution.

Key Takeaways for your "Thinking" toolkit:
Validation First: Always handle negative numbers or empty strings at the very top.
Be Specific: Only give discounts if the type matches exactly. Don't let an "else" block give away money by accident.
Dry Run the Math: Always ask: "If I have $100 and a 10% discount, is the answer $110 or $90?"
Return Values: Prefer returning numbers (double, int) from logic methods rather than sentences. This makes the code reusable (e.g., if you later want to show the price in a GUI or a mobile app).



how can i think this way

To think like a professional developer "in one go," you need to stop writing code immediately and follow a Mental Framework. Great programmers don't just type; they simulate the process in their heads first using these four steps:
1. The "Input-Process-Output" (IPO) Model
Before you write public static..., grab a piece of paper or open a notepad and define these three things:
Input: What data am I getting? (e.g., amount, customerType). Is it a String, Int, or Double?
Process: What is the exact math? (e.g., Price - (Price * Discount)).
Output: What does the caller need back? A number for a calculation? A status code? Or just a message?
2. Think in "Guard Clauses" (The "No" First Rule)
Instead of thinking about how to make the code work, try to think about how to make it fail. This is the secret to clean logic.
Ask: "When should I say NO to this request?"
If amount is negative? NO.
If name is empty? NO.
Handle all the "NOs" at the very top of your method. This clears the "garbage" out of the way so the rest of your logic can be simple and clean.
3. The "Human Logic" Test
Before writing if/else, explain the logic to yourself (or a rubber duck) in plain English.
Bad Logic: "If they are regular, do this; else, they must be premium."
Better Logic: "If they are regular, they get 10%. If they are premium, they get 15%. If they are anything else, they get 0%."
Why? The "Better Logic" is safer because it doesn't make assumptions about the "else" case.
4. Separate "Doing" from "Telling"
This is the most common mistake beginners make.
Doing: Calculating the discount (Math).
Telling: Printing "Welcome Customer! Your total is..." (UI).
The Rule: A method should either Do or Tell, but rarely both. If your method is named calculateDiscount, it should only do math. This makes your code "modular"—you can use that same math in a website, a mobile app, or a receipt printer without changing the logic.
Summary Checklist for your next problem:
Validate: Did I check for empty/negative/bad inputs at the start?
Specific vs. General: Did I use else if for specific types instead of a generic else?
Math Check: Did I verify the formula (e.g., Discount is -, Tax is +)?
Return Type: Am I returning a value that can be used for further math (like a double), or am I "trapping" the data inside a String?
Practice Tip: For your next assignment, try writing the "Guard Clauses" and the "Process" in plain English comments inside the method first. Only write the Java code once the English logic looks perfect.


 */

public class OnlineShoppingDiscountEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchased Amount : ");
        int purchaseAmount = sc.nextInt();
        if (purchaseAmount <= 0){
            System.out.println("Buy SomeProcudt");
            System.exit(0);
        }
        sc.nextLine();
        System.out.print("Enter the Customer Type (Regular/Premium) : ");
        String customerType = sc.nextLine();

        double  finalPayableAmount = payableAmount(purchaseAmount , customerType);
        System.out.println("Net payable amount is : "+ finalPayableAmount);
    }

    public static double payableAmount(int purchaseAmount, String customerType){
        double discountPercent = 0.0;
        if(customerType.equalsIgnoreCase("regular")){
            discountPercent = 0.10;
        }
        if(customerType.equalsIgnoreCase("premium")){
            discountPercent = 0.15;
        }
        double discountAmount = purchaseAmount * discountPercent;
        return purchaseAmount-discountAmount;
    }

}
