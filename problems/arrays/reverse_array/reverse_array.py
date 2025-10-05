def reverse_array(arr):
    """
    Reverse the array in-place using two-pointer technique
    """
    left, right = 0, len(arr) - 1
    while left < right:
        arr[left], arr[right] = arr[right], arr[left]
        left += 1
        right -= 1
    return arr

if __name__ == "__main__":
    tests = [
        [1, 2, 3, 4, 5],
        [10, 20, 30],
        [],
        [7]
    ]
    for arr in tests:
        print(f"Original: {arr} -> Reversed: {reverse_array(arr.copy())}")
