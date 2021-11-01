

import java.util.Scanner;

    public class Main {
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            LinkedList ll = new LinkedList();

            while (true) {
                System.out.print("""
                    1) Insert front
                    2) Insert back
                    3) Delete front
                    4) Delete back
                    5) Search
                    6) Print list
                    7) Quit
                    Option:\t""");

                switch (in.nextInt()) {
                    case 1 -> {
                        System.out.print("Key: ");
                        ll.insertFront(in.nextInt());
                    }
                    case 2 -> {
                        System.out.print("Key: ");
                        ll.insertBack(in.nextInt());
                    }
                    case 3 -> {
                        ll.DeleteFront();
                    }
                    case 4 -> {
                        ll.DeleteBack();
                    }
                    case 5 -> {
                        System.out.print("Element: ");
                        System.out.println("Search result: " + ll.search(in.nextInt()));
                    }
                    case 6 -> ll.print();
                    case 7 -> System.exit(0);
                    default -> System.out.println("Invalid input");
                }

                System.out.println();
            }
        }
    }

// Implementation of a double linked list with basic operations (insert, delete and search)
// listSearch is the only internal method of the class linkedList

