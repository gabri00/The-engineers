public class Set {
    private boolean[] bitVec;
    private int[] universe;
    private int currSize = 0;

    public Set(int n, int[] U) {
        bitVec = new boolean[n];
        universe = U;

        for (int i = 0; i < U.length; i++)
            bitVec[i] = false;
    }

    public void add(final int el) {
        for (int i = 0; i < universe.length; i++) {
            if (universe[i] == el) {
                bitVec[i] = true;
                currSize++;
            }
        }
    }

    public void remove(final int el) {
        for (int i = 0; i < universe.length; i++) {
            if (universe[i] == el) {
                bitVec[i] = false;
                currSize--;
            }
        }
    }

    public boolean isIn(final int el) {
        for (int i = 0; i < universe.length; i++)
            if (universe[i] == el) return bitVec[i];
        return false;
    }

    public int getSize() {
        return currSize;
    }
}
