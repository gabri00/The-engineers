public class Stack {
    private int[] stackArray;
    private int top;

    public Stack(final int n) {
        stackArray = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public int topEl() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            System.exit(1);
        }
        return stackArray[top];
    }

    public void push(int el) {
        if (isFull()) {
            System.out.println("Overflow, stack is full");
            System.exit(1);
        }
        stackArray[++top] = el;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow, empty stack");
            System.exit(1);
        }
        stackArray[top--] = 0;
    }

    public void print() {
        for (int el : stackArray)   System.out.println(el);
        System.out.println("Stack size: " + size());
    }
}
