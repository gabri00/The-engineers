package Core;

public class GraphMatrix {
    private int[][] graph;

    public GraphMatrix(int n){
        graph =  new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                graph[i][j] = 0;
            }
        }
    }
    public void link(int r, int c){
        if ( r < this.size() && c < this.size() )
            graph[r][c] = 1;
        else
            System.out.println("This link can't exist, out of bounds");
    }

    public void unLink(int r, int c){
        if ( r < this.size() && c < this.size() )
            graph[r][c] = 0;
        else
            System.out.println("This link can't exist, out of bounds");
    }

    public Boolean areLinked(int r, int c){
        if ( r < this.size() && c < this.size() )
            return graph[r][c] == 1;
        System.out.println("This link can't exist, out of bounds");
        return null;
    }

    public void print(){
        for (int i = 0; i < this.size(); i++){
            for(int j = 0; j < this.size(); j ++){
                System.out.print(graph[i][j] + " ");
            }System.out.println("");
        }
    }

    public int size(){
        return graph[1].length;
    }
}
