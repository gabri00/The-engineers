package Core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Chose the size of your graph: ");
        GraphLList gll = new GraphLList(in.nextInt());
        gll.size();

        while(true){
            System.out.print("""
                    1) Create Link
                    2) Delete Link
                    3) AreLinked ?
                    4) Size
                    5) Print
                    6) Exit
                    
                    Option:""");
            switch(in.nextInt()){
                case 1 -> {
                    System.out.println("Which node you wanna link?");
                    System.out.print("Node A:");
                    int a = in.nextInt();
                    System.out.print("Node B:");
                    int b = in.nextInt();
                    gll.link(a,b);
                    System.out.println("");
                }
                case 2 -> {
                    System.out.println("Which link you wanna delete?");
                    System.out.print("Node A:");
                    int a = in.nextInt();
                    System.out.print("Node B:");
                    int b = in.nextInt();
                    gll.unLink(a,b);
                    System.out.println("");
                }
                case 3 -> {
                    System.out.println("Which node you wanna chek?");
                    System.out.print("Node A:");
                    int a = in.nextInt();
                    System.out.print("Node B:");
                    int b = in.nextInt();
                    System.out.println("Chek result:" + gll.areLinked(a,b));
                    System.out.println("");
                }
                case 4 -> {
                    System.out.println("Size:" + gll.size());
                    System.out.println("");
                }
                case 5 -> {
                    gll.print();
                    System.out.println("");
                }
                case 6 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid input");
                    System.out.println("");
                }
            }
        }

    }
}