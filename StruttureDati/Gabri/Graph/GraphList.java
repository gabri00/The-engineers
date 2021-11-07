import java.util.ArrayList;
import java.util.LinkedList;

public class GraphList {
    private ArrayList<LinkedList<Integer>> adjList = new ArrayList<>();

    public GraphList(int n) {
        for (int i = 0; i < n; i++) adjList.add(i, new LinkedList<>());
    }

    public void link(int u, int v) {
        adjList.get(u).add(v);
    }

    public void unLink(int u, int v) {
        adjList.get(u).remove(v);
    }

    public boolean areLinked(int u, int v) {
        return adjList.get(u).contains(v);
    }

    public void print() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i);
            for (Integer el : adjList.get(i)) {
                System.out.print(" --> " + el);
            }
            System.out.println();
        }
    }
}

// Note: ho usate l'implementazione di linked list presente nella libreria standard