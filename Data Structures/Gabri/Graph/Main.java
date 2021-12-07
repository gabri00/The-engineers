import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        // GraphMatrix graph = new GraphMatrix(3);
        GraphList graph = new GraphList(3);

        while (true) {
            System.out.print("""
                    1) Link nodes
                    2) Unlink nodes
                    3) check if two nodes are linked
                    4) Print list
                    5) Graph density
                    6) Check if connected
                    7) Quit
                    Option:\t""");

            switch (in.nextInt()) {
                case 1 -> {
                    System.out.print("Node 1: ");
                    int x = in.nextInt();
                    System.out.print("Node 2: ");
                    int y = in.nextInt();
                    graph.link(x, y);
                }
                case 2 -> {
                    System.out.print("Node 1: ");
                    int x = in.nextInt();
                    System.out.print("Node 2: ");
                    int y = in.nextInt();
                    graph.unLink(x, y);
                }
                case 3 -> {
                    System.out.print("Node 1: ");
                    int x = in.nextInt();
                    System.out.print("Node 2: ");
                    int y = in.nextInt();

                    if (graph.areLinked(x, y))
                        System.out.printf("(%d, %d) linked%n", x, y);
                    else
                        System.out.printf("(%d, %d) not linked%n", x, y);
                }
                case 4 -> graph.print();
                case 5 -> System.out.println("Density: " + graph.density());
                case 6 -> System.out.println("Connected? " + graph.isConnected());
                case 7 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }

            System.out.println();
        }
    }
}

// Grafo senza pesi (direzionale e non in base a come si impostano gli archi)
// Il grafo è implementato con la matrice delle adiacenze