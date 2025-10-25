# largest_element.py

def largest_element(arr):
    if not arr:
        raise ValueError("Array is empty.")
    max_element = arr[0]
    for num in arr[1:]:
        if num > max_element:
            max_element = num
    return max_element


#  Test cases
if __name__ == "__main__":
    print("Running test cases for Python solution...\n")

    # Test 1
    arr1 = [3, 5, 7, 2, 8]
    print("Input:", arr1)
    print("Largest Element:", largest_element(arr1))
    print()

    # Test 2
    arr2 = [-5, -2, -10]
    print("Input:", arr2)
    print("Largest Element:", largest_element(arr2))
    print()

    # Test 3
    arr3 = [1, 1, 1]
    print("Input:", arr3)
    print("Largest Element:", largest_element(arr3))
