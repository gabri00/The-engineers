import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currMin = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[currMin]) currMin = j;
            }

            swap(array, i, currMin);
        }
    }

    private static void swap(int[] a, int i, int min) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = { 89, 45, 68, 90, 29, 34, 17 };
        System.out.println("Unsorted: " + Arrays.toString(numbers));

        selectionSort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));    }
}

