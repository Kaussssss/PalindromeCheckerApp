import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");

        String word = "madam";

        // Stack strategy timing
        PalindromeStrategy stackStrategy = new StackStrategy();

        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(word);
        long endStack = System.nanoTime();

        long stackTime = endStack - startStack;

        // Deque strategy timing
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(word);
        long endDeque = System.nanoTime();

        long dequeTime = endDeque - startDeque;

        // Display results
        System.out.println("Word: " + word);
        System.out.println();

        System.out.println("Stack Strategy Result : " + stackResult);
        System.out.println("Stack Execution Time  : " + stackTime + " ns");

        System.out.println();

        System.out.println("Deque Strategy Result : " + dequeResult);
        System.out.println("Deque Execution Time  : " + dequeTime + " ns");

        System.out.println("--------------------------------------");
        System.out.println("Performance comparison completed.");
    }
}