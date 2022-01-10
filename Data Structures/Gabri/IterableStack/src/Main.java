import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IterableStack<Integer> stack = new IterableStack<>();

        for (int i = 0; i < 10; i++) stack.push(i * 2);

        // Implicit iterator
        for (Integer el : stack) System.out.print(el + " ");
        System.out.println();

        Iterator<Integer> iter = stack.iterator();

        // Using the iterator explicitly
        while (iter.hasNext()) {
            Integer nextEl = iter.next();
            System.out.print(nextEl + " ");
        }

    }
}
