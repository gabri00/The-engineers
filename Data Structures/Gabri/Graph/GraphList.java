import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphList {
    private ArrayList<LinkedList<Integer>> adjList = new ArrayList<>();
    private int V = 0, E = 0;   // alias |V| and |E|

    // Constructor: init graph adjacency list
    public GraphList(int n) {
        V = n;
        for (int i = 0; i < n; i++) adjList.add(i, new LinkedList<>());
    }

    // Links two nodes
    public void link(int u, int v) {
        adjList.get(u).add(v);
        if (!adjList.get(v).contains(u)) E++;   // Aggiorna E solo se il collegamento non esiste già nel caso di grafo non diretto
    }

    // Unlinks two nodes
    public void unLink(int u, int v) {
        adjList.get(u).remove(v);
        if (!adjList.get(v).contains(u)) E--;
    }

    // Checks if two nodes are connected
    public boolean areLinked(int u, int v) {
        return adjList.get(u).contains(v);
    }

    // Calculates the graph density
    public float density() {
        return (float) (2*E) / (V * (V-1));
    }

    // Checks if the graph is connected
    public boolean isConnected() {
        for (LinkedList<Integer> links : adjList)
            if (links.isEmpty()) return false;
        return true;
    }

    // Prints the adjacency list of the graph
    public void print() {
        for (int u = 0; u < adjList.size(); u++) {
            System.out.print(u);
            for (Integer el : adjList.get(u))
                System.out.print(" --> " + el);
            System.out.println();
        }
    }

    // Deph First Search algorithm
    public void DFS() {
        Color[] marked = new Color[V];

        for (int u = 0; u < adjList.size(); u++)
            marked[u] = Color.WHITE;

        for (int u = 0; u < adjList.size(); u++)
            if (marked[u] == Color.WHITE) DFSvisit(u, marked);
    }

    private void DFSvisit(int u, Color[] marked) {
        marked[u] = Color.GREY;

        for (int v : adjList.get(u)) {  // Enhanced for better than iterator
            if (marked[v] == Color.WHITE)
                DFSvisit(v, marked);
        }

        marked[u] = Color.BLACK;
    }

    // Breadth First Search algorithm
    public void BFS() {
        Color[] marked = new Color[V];

        for (int u = 0; u < adjList.size(); u++)
            marked[u] = Color.WHITE;

        for (int u = 0; u < adjList.size(); u++)
            if (marked[u] == Color.WHITE)
                BFSvisit(u, marked);
    }

    private void BFSvisit(int s, Color[] marked) {
        Queue<Integer> Q = new LinkedList<>();
        marked[s] = Color.GREY;
        Q.add(s);

        while (!Q.isEmpty()) {
            int u = Q.remove();

            for (int v : adjList.get(u)) {
                if (marked[v] == Color.WHITE) {
                    marked[v] = Color.GREY;
                    Q.add(v);
                }
            }

            marked[u] = Color.BLACK;
        }
    }

    public GraphList transposeGraph() {
        GraphList G_transposed = new GraphList(V);

        for (int u = 0; u < adjList.size(); u++) {
            for (int v : adjList.get(u))
                G_transposed.link(v, u);
        }
        return G_transposed;
    }
}

enum Color { WHITE, GREY, BLACK; }

// Un grafo è rappresentato da G = (V,E) con V: vertici e E: archi