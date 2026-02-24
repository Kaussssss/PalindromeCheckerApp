import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
void main() {

            Scanner sc = new Scanner(System.in);

            System.out.println("=== UC6 : Queue + Stack Based Palindrome Check ===");
            System.out.print("Enter a String: ");

            String input = sc.nextLine();

            input = input.toLowerCase();

            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                queue.add(ch);
                stack.push(ch);
            }

            boolean isPalindrome = true;
            while (!queue.isEmpty()) {
                char fromQueue = queue.remove();
                char fromStack = stack.pop();

                if (fromQueue != fromStack) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Result: It is a Palindrome.");
            } else {
                System.out.println("Result: It is NOT a Palindrome.");
            }

            sc.close();
        }

