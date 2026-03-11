# Palindrome Checker App

## Use Case 8 – Linked List Based Palindrome Checker

### Objective
Implement palindrome validation using a **Singly Linked List** and efficient pointer techniques.

The algorithm converts the input string into a linked list and checks whether it forms a palindrome by reversing the second half and comparing both halves.

---

## Changes from UC7

Previous approach (UC7):
- Used **Deque**
- Compared front and rear elements directly

New approach (UC8):
- Converts the string into a **Singly Linked List**
- Uses **fast and slow pointer technique** to find the middle
- Reverses the **second half of the list in-place**
- Compares both halves of the list

This demonstrates how palindrome validation can be performed efficiently using linked list operations.

---

## Key Concepts Used

### Singly Linked List

A linked list consists of nodes where each node contains:
