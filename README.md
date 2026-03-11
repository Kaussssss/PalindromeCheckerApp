# Palindrome Checker App

## Use Case 9 – Recursive Palindrome Checker

### Objective
Implement palindrome validation using **recursion**, where the algorithm repeatedly compares characters from the beginning and end of the string.

---

## Changes from UC8

Previous approach (UC8):
- Used **Singly Linked List**
- Applied fast-slow pointer technique
- Reversed the second half of the list

New approach (UC9):
- Uses **Recursion**
- Compares characters at the **start and end indexes**
- Recursively moves inward
- Stops when the base condition is reached

This approach demonstrates how recursion can break down the palindrome problem into smaller subproblems.

---

## Key Concepts Used

### Recursion

Recursion is a technique where a method calls itself to solve a smaller version of the same problem.

Example method:

```java
isPalindrome(str, start + 1, end - 1);