public class MoveZeroToEnd {
    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0; // Pointer for the next non-zero element position

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
