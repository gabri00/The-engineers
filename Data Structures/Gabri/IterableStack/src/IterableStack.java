import java.util.ArrayList;
import java.util.Iterator;

public class IterableStack<T> implements Iterable<T> {
    private ArrayList<T> stack;

    public IterableStack() {
        stack = new ArrayList<>();
    }

    public void push(T el) {
        stack.add(el);
    }

    public T pop() {
        if (stack.size() > 0)
            return stack.remove(stack.size() - 1);
        else
            return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private int currIdx;

        public StackIterator() {
            currIdx = stack.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return currIdx >= 0;
        }

        @Override
        public T next() {
            T el = null;

            if (hasNext()) {
                el = stack.get(currIdx);
                currIdx--;
            }
            return el;
        }
    }
}
