public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare both strings
        if (original.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Program finished.");
    }
}