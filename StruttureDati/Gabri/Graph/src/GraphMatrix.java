public class GraphMatrix {
    private boolean[][] am;
    public GraphMatrix(int dim) {
        am = new boolean[dim][dim];
    }

    public void link(int u, int v) {
        am[u][v] = true;
    }

    public void unLink(int u, int v) {
        am[u][v] = false;
    }

    public boolean areLinked(int u, int v) {
        return am[u][v];
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < am.length; i++) {
            for (int j = 0; j < am.length; j++) {
                if (am[i][j])
                    System.out.printf("(%d, %d)%n", i, j);
            }
        }
    }
}
