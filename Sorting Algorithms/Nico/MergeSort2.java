import java.util.Scanner;

public class MergeSort2 {
    static void mergeSort2(int[] a){
        int n = a.length;
        int[] b = new int[n];
        mergeSortRec(a, b, 0, n - 1);
    }

    public static void mergeSortRec( int[] a, int[] b, int lo, int hi ) {
        if(hi > lo){
            int mid = lo + ( hi - lo) / 2;
            mergeSortRec(a, b, lo, mid);
            mergeSortRec(a, b, mid + 1 , hi);
            merge2( a, b, lo, mid,hi);
        }
    }

    public static void merge2( int []a, int []b, int lo,int mid, int hi ) {
        for( int k = 0; k <= hi; k++)
            b[k] = a[k];
        int i = lo;
        int j = mid + 1;
        for ( int k = lo; k <= hi; k++){
            if( i > mid){
                a[k] = b[j];
                j++;
            }
            else if (j > hi){
                a[k] = b[i];
                i++;
            }
            else if(b[j] < b[i]){
                a[k] = b[j];
                j++;
            }
            else { // b[i] < b[j]
                a[k] = b[i];
                i++;
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Chose the size of your array: ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.println("fill your array: ");
        for ( int i = 0; i < size; i++){
            numbers[i] = in.nextInt();
        }

        System.out.println("The array is: ");
        for ( int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }

        mergeSort2(numbers);
        System.out.println("The array ordered is: ");
        for ( int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
