# Palindrome Checker App

## Use Case 3 – Palindrome Check Using String Reverse

### Objective
Implement palindrome detection by reversing a string using a loop and comparing it with the original string.

### Changes from UC2
- Added logic to reverse the string using a `for` loop.
- Introduced string concatenation to construct the reversed string.
- Used the `equals()` method to compare the original and reversed strings.
- Displayed both strings and the result.

### Key Java Concepts Used

#### 1. Loop (for loop)
Used to iterate through the string characters in reverse order.

Example:
```java
for (int i = original.length() - 1; i >= 0; i--)