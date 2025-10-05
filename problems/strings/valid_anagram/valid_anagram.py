def isAnagram(s: str, t: str) -> bool:
        
        # Check length of source string vs target string. And check unique characters of source string vs target string. 
        unique_chars_s = set(s)
        if len(s) != len(t) and unique_chars_s != set(t):
            return False

        # Check the count of each unique character in the source string against the count of the same character in the target string.
        for c in unique_chars_s:
            if s.count(c) != t.count(c):
                return False
        return True

source = 'aabc'
target = 'baca'
print(isAnagram(source, target))