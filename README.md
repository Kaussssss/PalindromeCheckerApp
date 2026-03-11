# Palindrome Checker App

## Use Case 4 – Character Array Based Palindrome Check

### Objective
Implement palindrome validation using a character array and the two-pointer technique.

Instead of reversing the string like in UC3, this version converts the string into a character array and compares characters from both ends moving toward the center.

---

## Changes from UC3

Previous approach:
- Reversed the string using a loop
- Created a new string using concatenation
- Compared original and reversed strings

New approach (UC4):
- Convert the string into a `char[]`
- Use two pointers (`start` and `end`)
- Compare characters directly
- Avoid creating extra string objects

This improves **memory efficiency and comparison speed**.

---

## Key Concepts Used

### Character Array (char[])
A primitive array used to store characters individually.

Example:
```java
char[] characters = word.toCharArray();