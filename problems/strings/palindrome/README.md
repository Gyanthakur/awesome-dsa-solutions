# Palindrome (Valid Palindrome)

## Problem
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

### Example
Input: "A man, a plan, a canal: Panama"  
Output: true

Input: "race a car"  
Output: false

### Approach
Use two pointers (left, right). Move pointers inward while skipping non-alphanumeric characters. Compare characters in lowercase. If all matched, it's a palindrome.

Time Complexity: O(n)  
Space Complexity: O(1)
