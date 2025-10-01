# Two Sum

## Problem
Given an array of integers and a target, return the indices of the two numbers that add up to the target.

### Example
Input: nums = [2,7,11,15], target = 9  
Output: [0,1]

### Approach
- Use a hash map to store seen numbers.
- For each number, check if `target - num` exists.
- Time: O(n), Space: O(n).
