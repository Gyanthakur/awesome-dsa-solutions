# Largest Element in Array

## Problem Description
Given an array of integers, your task is to find and return the **largest element** in the array.  
The largest element is the one with the **highest value** among all elements in the array.

If the array is empty, your program should handle it appropriately (e.g., by raising an error or showing a message).

---

## Input
- An integer array `arr` of size `n` (where `n > 0`).

## Output
- A single integer — the **largest element** in the array.

---

## 🧠 Approach
1. Start by assuming the **first element** of the array is the largest.  
2. Traverse the rest of the array:
   - For each element, compare it with the current largest value.  
   - If it’s greater, update the largest value.  
3. After checking all elements, return the largest one.  

This approach ensures every element is checked exactly once.

---

## ⏱️ Complexity
- **Time Complexity:** O(n) — one pass through the array  
- **Space Complexity:** O(1) — only a constant amount of extra space is used  

