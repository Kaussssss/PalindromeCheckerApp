public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");

        // Hardcoded string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Two pointer comparison
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display results
        System.out.println("Original String  : " + input);
        System.out.println("Normalized String: " + normalized);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Program completed.");
    }
}