# Palindrome Checker App

## Use Case 7 – Deque Based Optimized Palindrome Checker

### Objective
Implement palindrome validation using a **Deque (Double Ended Queue)** to compare characters from the front and rear efficiently.

---

## Changes from UC5

Previous approach (UC5):
- Used a **Stack**
- Required pushing and popping elements to reverse the string

New approach (UC7):
- Uses a **Deque**
- Allows removing elements from both ends
- Directly compares **first and last characters**
- No explicit string reversal required

This makes the algorithm cleaner and reduces unnecessary operations.

---

## Key Concepts Used

### Deque (Double Ended Queue)

A **Deque** allows insertion and deletion from **both front and rear**.

Implementation used:

```java
Deque<Character> deque = new ArrayDeque<>();