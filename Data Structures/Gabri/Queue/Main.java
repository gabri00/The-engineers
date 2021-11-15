import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        Queue queue = new Queue(3);

        while (true) {
            System.out.print("""
                    1) Enqueue
                    2) Dequeue
                    3) Head
                    4) Tail
                    5) Print stack
                    6) Quit
                    Option:\t""");

            switch (in.nextInt()) {
                case 1 -> {
                    System.out.print("Element: ");
                    queue.enqueue(in.nextInt());
                }
                case 2 -> queue.dequeue();
                case 3 -> System.out.println("Head: " + queue.getHead());
                case 4 -> System.out.println("Tail: " + queue.getTail());
                case 5 -> queue.print();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }

            System.out.println();
        }
    }
}

// La coda è gestita in modo circolare, per permetterene un uso continuo
// La coda può contenere n-1 elementi, perché se ne contenesse n non sarei in grado di distinguere la testa dalla coda
