import java.util.Stack;

// Service class that handles palindrome logic
class PalindromeChecker {

    // Method to check palindrome using a stack
    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        return word.equals(reversed);
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");

        String word = "madam";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Call service method
        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println("Result: " + word + " is a Palindrome.");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Program completed.");
    }
}