# Palindrome Checker App

## Use Case 11 – Object-Oriented Palindrome Service

### Objective
Refactor the palindrome checker using **Object-Oriented Programming (OOP)** principles by separating the palindrome logic into a dedicated service class.

---

## Changes from UC10

Previous approach:
- All logic was implemented inside the `main()` method.

New approach (UC11):
- Introduced a **PalindromeChecker service class**
- Palindrome logic moved to a method `checkPalindrome()`
- Main class now focuses only on application flow

This improves **code modularity and maintainability**.

---

## Key OOP Concepts Used

### Encapsulation

The palindrome checking logic is encapsulated inside the class:
class PalindromeChecker

The logic is hidden from the main program and accessed through a method.

---

### Single Responsibility Principle

Each class now has a single responsibility:
q
PalindromeCheckerApp → application execution
PalindromeChecker → palindrome validation logic


This separation improves code structure.

---

### Method Exposure

The service exposes a public method:

```java
public boolean checkPalindrome(String word)

The main program calls this method to check whether the string is a palindrome.

Data Structure Used

The palindrome logic internally uses a Stack to reverse characters.

Example flow:

Push: m a d a m
Pop : m a d a m

Because stack follows LIFO (Last In First Out), it naturally reverses the string.

Time Complexity
O(n)

Each character is processed once.

Space Complexity
O(n)

The stack stores all characters.

Example Output
======================================
        PALINDROME CHECKER APP
======================================
Result: madam is a Palindrome.
--------------------------------------
Program completed.
Compilation
javac PalindromeCheckerApp.java
Execution
java PalindromeCheckerApp