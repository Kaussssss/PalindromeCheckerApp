# Palindrome Checker App

## Use Case 10 – Case-Insensitive & Space-Ignored Palindrome

### Objective
Enhance the palindrome checker to ignore **letter case** and **spaces** during validation.

This ensures that phrases like:
"A man a plan a canal Panama"

are correctly identified as palindromes.

---

## Changes from UC9

Previous approach (UC9):
- Used recursion
- Compared characters directly

New approach (UC10):
- Introduces **string preprocessing**
- Converts all characters to **lowercase**
- Removes **spaces using regular expressions**
- Performs palindrome validation on the cleaned string

---

## Key Concepts Used

### String Preprocessing

The string is normalized before comparison.

Example:

```java
String normalized = input.toLowerCase().replaceAll("\\s+", "");