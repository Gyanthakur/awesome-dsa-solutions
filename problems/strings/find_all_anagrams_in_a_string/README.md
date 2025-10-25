#  Longest Common Prefix

## Problem

Given two strings s and t, return an array of all the start indices of t's anagrams in s. You may return the answer in any order.

## Examples

#### Example 1:

Input: s = "cbaebabacd", t = "abc"

Output: [0,6]

Explanation:

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".

#### Example 2:

Input: s = "abab", t = "ab"

Output: [0,1,2]

Explanation:

The substring with start index = 0 is "ab", which is an anagram of "ab".

The substring with start index = 1 is "ba", which is an anagram of "ab".

The substring with start index = 2 is "ab", which is an anagram of "ab".

## Approach
 - Build a frequency map for the target string t.

 - Use a sliding window of length len(t) over the source string s.

 - Maintain a frequency map for characters in the current window.

 - Compare the window map with the target map; if equal, record the starting index.

 - Slide the window forward, updating the map by adding the new char and removing the old one, until the end of s.

## Time Complexity O(n)