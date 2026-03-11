public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");

        // Hardcoded string
        String word = "madam";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: " + word + " is a Palindrome.");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Program completed.");
    }
}