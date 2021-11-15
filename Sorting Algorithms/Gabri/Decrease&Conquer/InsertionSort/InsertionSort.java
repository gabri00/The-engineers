import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int el = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > el) arr[j + 1] = arr[j--];

            arr[j+1] = el;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 89, 45, 68, 90, 29, 34, 17 };
        System.out.println("Unsorted: " + Arrays.toString(numbers));

        insertionSort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}
