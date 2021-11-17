package Core;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Chose the size for the set");
        Set s = new Set(in.nextInt());

        while (true) {
            System.out.print("""
                    0) Create a Set
                    1) Add
                    2) Remove
                    3) Size
                    4) Contains ?
                    5) Print
                    6) Union
                    7) Intersect
                    8) Difference
                    9) Complement
                    10) Exit
                    Option:\t""");

            switch (in.nextInt()) {
                case 0 -> {
                        System.out.println("Chose the size for the set");
                        Set s1 = new Set(in.nextInt());
                }
                case 1 -> {
                    System.out.print("Item ");
                    s.add(in.nextInt());
                }
                case 2 -> {
                    System.out.print("Item: ");
                    s.remove(in.nextInt());
                }
                case 3 -> {
                    System.out.print("Size: " + s.size());
                }
                case 4 -> {
                    System.out.print("Item: ");
                    System.out.println("Search result: " + s.contains(in.nextInt()));
                }
                case 5 -> {
                    s.print();
                }
                case 6 -> {
                    System.out.println("Choose the Set to union:");
                    Set c =
                    System.out.println("The result is:");

                }
                case 7 -> {
                    s.print();
                }
                case 8 -> {
                    s.print();
                }
                case 9 -> {
                    //System.out.println("Choose a name for the new Set:");
                    Set b = s.complement();
                    b.print();
                    System.out.println();
                }
                case 10 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }

            System.out.println();
        }
    }
}
