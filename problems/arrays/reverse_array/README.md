# Reverse Array

## Problem
Given an array of integers, reverse the array **in-place**.

### Example
Input: [1, 2, 3, 4, 5]  
Output: [5, 4, 3, 2, 1]

Input: [10, 20, 30]  
Output: [30, 20, 10]

### Approach
- Use two pointers: one at the start and one at the end of the array.
- Swap the elements at the two pointers and move them toward the center.
- Repeat until pointers meet or cross.

Time Complexity: O(n)  
Space Complexity: O(1) (in-place)
