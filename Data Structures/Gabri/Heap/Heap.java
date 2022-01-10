public class Heap {
    private int size;
    private int[] table;

    public Heap(int[] A) {
        this.size = A.length;
        this.table = new int[A.length + 1];

        // for (int j = 0; j < A.length; j++) this.table[j+1] = A[j];
        System.arraycopy(A, 0, this.table, 1, A.length);

        for (int i = Math.floorDiv(A.length, 2); i > 0; i--)
            sink(i);
    }

    private void sink(int i) {
        int[] A = this.table;
        int n = this.size;
        int l = left(i), r = right(i);
        int m;

        if (l <= n && A[l] > A[r]) m = l;
        else m = i;

        if (r <= n && A[r] > A[m]) m = r;

        if (m != i) {
            swap(A, i, m);
            sink(m);
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private int parent(int i) {
        return Math.floorDiv(i, 2);
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return 2 * i + 1;
    }

    // Operations for max-heaps
    public int max() {
        return table[1];
    }

    public int extractMax() {
        if (size >= 1) throw new AssertionError();

        int max = max();
        table[1] = table[size--];
        sink(1);

        return max;
    }

    public void insert(int x) {
        size++;
        table[size] = x;
        swim(size);
    }

    private void swim(int i) {
        int p = parent(i);
        while (i > 1 && table[p] < table[i]) {
            swap(table, i, p);
            i = p;
        }
    }
}