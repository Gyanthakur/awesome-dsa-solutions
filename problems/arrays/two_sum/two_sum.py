def two_sum(nums, target):
    seen = {}
    for i, num in enumerate(nums):
        if target - num in seen:
            return [seen[target - num], i]
        seen[num] = i

print(two_sum([2, 7, 11, 15], 9))  # [0, 1]
