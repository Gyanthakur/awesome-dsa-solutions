# max-circular-subarray-sum

## Problem

given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray.
In a circular array, the subarray can start at the end and wrap around to the beginning.
Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

## Example 1

Input: arr[] = [8, -8, 9, -9, 10, -11, 12]

Output: 22

Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion,
we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.


## Example 2

Input: arr[] = [5, -2, 3, 4]

Output: 12

Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.

## Approach

- Use Kadane’s Algorithm to find the maximum subarray sum (non-circular).
- Use Kadane’s Algorithm again to find the minimum subarray sum.
- Subtract the minimum subarray sum from the total array sum to get the circular sum.
- Return the maximum of the non-circular and circular sums.
- Handle edge case: if all elements are negative, return the non-circular sum only.

## Time Complexity

O(n) — single pass for max and min subarray sums.

##  Space Complexity

O(1) — no extra space used, in-place calculations.