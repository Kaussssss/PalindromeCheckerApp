# Palindrome Checker App

## Use Case 12 – Strategy Pattern for Palindrome Algorithms

### Objective

Implement the **Strategy Design Pattern** to allow the palindrome algorithm to be selected dynamically at runtime.

This design enables the application to switch between different palindrome checking algorithms without modifying the core application logic.

---

## Changes from UC11

Previous version (UC11):

- Introduced object-oriented design
- Palindrome logic encapsulated in a service class

New version (UC12):

- Introduced **Strategy Pattern**
- Multiple palindrome algorithms implemented as strategies
- Algorithm selection happens at runtime

---

## Architecture


PalindromeStrategy (Interface)
|
|---- StackStrategy
|
|---- DequeStrategy
|
PalindromeChecker (Context)
|
PalindromeCheckerApp (Main Program)


---

## Key Concepts Used

### Interface

Defines the contract for all palindrome strategies.

```java
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

Any class implementing this interface must provide its own palindrome algorithm.

Polymorphism

Different strategies implement the same method:

StackStrategy.checkPalindrome()
DequeStrategy.checkPalindrome()

The program can use any strategy interchangeably.

Strategy Pattern

The Strategy Pattern allows selecting an algorithm at runtime.

Example:

PalindromeStrategy strategy = new StackStrategy();

or

PalindromeStrategy strategy = new DequeStrategy();

The PalindromeChecker class executes the chosen algorithm.

Data Structures Used

Different strategies may use different data structures.

Example:

StackStrategy → Stack
DequeStrategy → Deque

This makes the design flexible and extendable.

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