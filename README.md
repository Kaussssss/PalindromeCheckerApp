# Palindrome Checker App

## Use Case 13 – Performance Comparison

### Objective

Compare the performance of different palindrome checking algorithms by measuring their execution time.

This helps evaluate which algorithm performs more efficiently.

---

## Changes from UC12

Previous version (UC12):

- Introduced Strategy Pattern
- Allowed selecting palindrome algorithms dynamically

New version (UC13):

- Runs multiple strategies sequentially
- Measures execution time using `System.nanoTime()`
- Displays performance comparison results

---

## Algorithms Compared

1. **Stack Strategy**

Uses a stack to reverse characters and compare with the original string.

Data Structure:


Stack (LIFO)


---

2. **Deque Strategy**

Uses a double-ended queue to compare front and rear characters directly.

Data Structure:


Deque


---

## Performance Measurement

Execution time is captured using:

```java
long start = System.nanoTime();

and

long end = System.nanoTime();

Execution time:

end - start

This returns the time in nanoseconds (ns).

Example Output
======================================
        PALINDROME CHECKER APP
======================================

Word: madam

Stack Strategy Result : true
Stack Execution Time  : 45000 ns

Deque Strategy Result : true
Deque Execution Time  : 32000 ns

--------------------------------------
Performance comparison completed.
Compilation
javac PalindromeCheckerApp.java
Execution
java PalindromeCheckerApp