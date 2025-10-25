public class CountingSort {
    static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        int max = arr[0];
        for (int num : arr)
            if (num > max) max = num;

        int[] count = new int[max + 1];
        for (int num : arr)
            count[num]++;

        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
