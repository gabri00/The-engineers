import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack stack = new Stack(3);

        while (true) {
            System.out.print("""
                    1) Push
                    2) Pop
                    3) Get top
                    4) Print stack
                    5) Quit
                    Option:\t""");

            switch (in.nextInt()) {
                case 1 -> {
                    System.out.print("Element: ");
                    stack.push(in.nextInt());
                }
                case 2 -> stack.pop();
                case 3 -> System.out.println("Top: " + stack.topEl());
                case 4 -> stack.print();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }

            System.out.println();
        }
    }
}

// Per gestire la stack (di int) viene usata un'array di n elementi.
//Lo 0 indica che la corrispondente cella della stack è vuota
