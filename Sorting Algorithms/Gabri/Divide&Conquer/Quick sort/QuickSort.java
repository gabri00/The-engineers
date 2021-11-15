import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // partitioning index
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Select the last element as pivot
        int i = low - 1;        // Index of the smaller element

        for (int j = low; j <= high-1; j++) {
            // If current element is smaller than the pivot increment i and swap
            if (arr[j] <= pivot) swap(arr, ++i, j);
        }

        swap(arr, i+1, high);

        return i+1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = { 89, 45, 68, 90, 29, 34, 17 };
        System.out.println("Unsorted: " + Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}
