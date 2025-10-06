#  Longest Common Prefix

## Problem

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

## Examples

#### Example 1:

Input: strs = ["flower","flow","flight"]

Output: "fl"

#### Example 2:

Input: strs = ["dog","racecar","car"]

Output: ""

Explanation: There is no common prefix among the input strings.

## Approach

Iterate over shortest string in the list.

For each iteration, check if the characters at the same index in all strings are the same.

    #Input: ["flower","flow","flight"]
    #Output: "fl"

    # flower       flow        flight
    #  0  i         j  i        j  i
    # [0][0] - f = [1][0] - f, [2][0] - f
    # [0][1] - l = [1][1] - l, [2][1] - l
    # [0][2] - o = [1][2] - o, [2][2] - o
    # [0][3] - w = [1][3] - w, [2][3] - w


## Time Complexity
O(n×L)

where
n = number of strings, L = length of the shortest string.