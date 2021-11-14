import java.util.Arrays;

public class Main {
    private static void mergeSort(int[] arrA) {
        int[] arrBuffer = new int[arrA.length];
        mergeSortRecursive(arrA, arrBuffer, 0, arrA.length - 1);
    }

    private static void mergeSortRecursive(int[] arrA, int[] arrB, int low, int high) {
        if (high > low) {
            int mid = low + (high-low)/2;
            mergeSortRecursive(arrA, arrB, low, mid);
            mergeSortRecursive(arrA, arrB, mid+1, high);
            merge(arrA, arrB, low, mid, high);
        }
    }

    private static void merge(int[] arrA, int[] arrB, int low, int mid, int high) {
        if (high + 1 - low >= 0) System.arraycopy(arrA, low, arrB, low, high + 1 - low);
        // equivalent to: for (int k = low; k <= high; k++) arrB[k] = arrA[k];

        int i = low, j = mid + 1;

        for (int k = low; k <= high; k++) {
            if (i > mid) arrA[k] = arrB[j++];
            else if (j > high) arrA[k] = arrB[i++];
            else if (arrB[j] < arrB[i]) arrA[k] = arrB[j++];
            else arrA[k] = arrB[i++];
        }
    }

    public static void main(String[] args) {
        int[] arrA = { 89, 45, 68, 90, 29, 34, 17 };

        System.out.println("Unordered: " + Arrays.toString(arrA));

        mergeSort(arrA);
        System.out.println("Ordered: " + Arrays.toString(arrA));
    }
}
