class Solution:

    def maxCircularSum(self, arr):
        totalSum = 0
        currMaxSum = 0
        currMinSum = 0
        maxSum = arr[0]
        minSum = arr[0]

        for i in range(len(arr)):

            # Kadane's to find maximum sum subarray
            currMaxSum = max(currMaxSum + arr[i], arr[i])
            maxSum = max(maxSum, currMaxSum)

            # Kadane's to find minimum sum subarray
            currMinSum = min(currMinSum + arr[i], arr[i])
            minSum = min(minSum, currMinSum)

            # Sum of all the elements of input array
            totalSum += arr[i]

        normalSum = maxSum
        circularSum = totalSum - minSum

        # If the minimum subarray is equal to total Sum
        # then we just need to return normalSum
        if minSum == totalSum:
            return normalSum

        return max(normalSum, circularSum)