import java.util.*;

public class reverse_array {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1, 2, 3, 4, 5},
            {10, 20, 30},
            {},
            {7}
        };

        for (int[] arr : tests) {
            System.out.print("Original: ");
            printArray(arr);
            reverseArray(arr);
            System.out.print("Reversed: ");
            printArray(arr);
            System.out.println();
        }
    }
}
