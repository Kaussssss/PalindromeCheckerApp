public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Application Startup
        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : 1.0");
        System.out.println("--------------------------------------");

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Program completed.");
    }
}