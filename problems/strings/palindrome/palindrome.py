import re

def is_palindrome(s: str) -> bool:
    """
    Check if the given string is a palindrome considering only alphanumeric characters and ignoring case.
    """
    left, right = 0, len(s) - 1
    while left < right:
        # Move left pointer to next alphanumeric
        while left < right and not s[left].isalnum():
            left += 1
        # Move right pointer to previous alphanumeric
        while left < right and not s[right].isalnum():
            right -= 1
        if left < right:
            if s[left].lower() != s[right].lower():
                return False
            left += 1
            right -= 1
    return True

if __name__ == "__main__":
    tests = [
        ("A man, a plan, a canal: Panama", True),
        ("race a car", False),
        ("", True),
        ("0P", False),
        ("Able was I, ere I saw Elba", True)
    ]
    for inp, expected in tests:
        print(f"{inp!r} -> {is_palindrome(inp)} (expected: {expected})")
