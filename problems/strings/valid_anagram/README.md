# Valid Anagram
## Problem

Given two strings s and t, check whether t is an anagram of s.
Two strings are anagrams if they contain the same characters with the same frequencies, in any order.

## Examples

| **s** | **t** | **Length Match** | **Unique Chars Match** | **Character Counts Match** | **Result** | **Explanation** |
|-------|-------|------------------|-------------------------|-----------------------------|-------------|-----------------|
| `aabc` | `abc`  | ❌ | ✅ | ✅ | ❌ | Lengths differ |
| `aabc` | `abcd` | ✅ | ❌ | ❌ | ❌ | Unique characters differ |
| `aabc` | `baca` | ✅ | ✅ | ✅ | ✅ | All conditions satisfied |

## Approach

Check lengths:
If the lengths of s and t differ, they can’t be anagrams.

Check unique characters:
If the sets of unique characters differ, they can’t be anagrams.

Compare character counts:
For every unique character in s, check that its count in t is the same.

### Time Complexity: O(n²)


## Optimized Solution Approach O(n):

Create a HashMap and update +1 for source string and -1 for target string simultaneously then check if all counts balance out.

```
def isAnagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    
    char_count = {}

    # Increment for source and decrement for target
    for i in range(len(s)):
        char_count[s[i]] = char_count.get(s[i], 0) + 1
        char_count[t[i]] = char_count.get(t[i], 0) - 1

    # Check if all counts are zero
    return next((False for count in char_count.values() if count != 0), True)

source = 'aabc'
target = 'baca'
print(isAnagram(source, target))
```