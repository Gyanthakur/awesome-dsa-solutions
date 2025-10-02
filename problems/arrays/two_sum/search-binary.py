#author: seema kumari patel
#implementation of binary search algorithm in python

def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        # Check if target is present at mid
        if arr[mid] == target:
            return mid
        # If target is greater, ignore left half
        elif arr[mid] < target:
            left = mid + 1
        # If target is smaller, ignore right half
        else:
            right = mid - 1
            
    # Target was not found in the array
    return -1

binary_search([1, 2, 3, 4, 5, 6, 7, 8, 9], 5)
