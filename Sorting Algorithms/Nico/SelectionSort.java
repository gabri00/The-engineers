import java.util.Scanner;

public class SelectionSort {

    public static void SelectionSort(int[] a){
        int n = a.length;
        int min;
        for(int i = 0; i < n; i++){
            min = i;
            for( int j = i + 1; j < n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
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

        SelectionSort(numbers);
        System.out.println("The array ordered with SelectionSort is: ");
        for ( int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
