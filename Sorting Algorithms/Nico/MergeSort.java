import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int[] a){
        MergeSortrec(a);
    }

     static void MergeSortrec(int[] a){
        int n = a.length;
        if( n > 1){
            int mb, mc ;
            int[] b, c;

            mb = n/2;
            mc = (n-n/2);
            b = new int[mb];
            c = new int[mc];

            System.out.println(" ");
            System.out.println("Ora copio la prima parte ");
            copy(a, b, 0, (n/2 -1));

            System.out.println(" ");
            System.out.println("Ora copio la seconda parte ");
            copy(a, c, n/2, n -1);

            MergeSortrec(b);
            MergeSortrec(c);
            merge(b, c, a); // fondo b e c ordinati dentro a
        }
    }

    static void merge(int[] b, int[] c, int[] a){
         int mb = b.length;
         int mc = c.length;
         int i,j,k;
         i = 0;
         j = 0;
         k = 0;


        while( i < mb && j < mc ){
             if( b[i] <= c[j]) {
                 a[k] = b[i]; i++;
             } else {
                 a[k] = c[j]; j++;
             }
             k++;
         }
         if( i == mb) { // tutti gli elementi di b sono giá stato copiati
             while (j < mc){
                 a[k] = c[j];
                 j++; k++;
             }
         }
         else{ // tutti gli elementi di c sono giá stati copiati
             while( i < mb){
                 a[k] = b[i];
                 i++; k++;
             }
         }
    }
    public static void copy(int[] a, int[] b, int lo, int hi) {
        int j = 0;
        for (int i = lo; i <= hi; i++){
            b[j] = a[i];
            j++;
        }
        for( int k = 0; k< b.length; k++)
            System.out.print(b[k]+ " ");
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

        mergeSort(numbers);
        System.out.println("The array ordered is: ");
        for ( int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
