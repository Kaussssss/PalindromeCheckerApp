public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println("Result: " + word + " is a Palindrome.");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Program completed.");
    }

    // Recursive palindrome check
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}