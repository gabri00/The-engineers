public class Queue {
    private int[] queueArray;
    private int head, tail, currSize;


    public Queue(final int n) {
        queueArray = new int[n];
        head = tail = currSize = 0;
    }

    public void enqueue(final int el) {
        if ((tail+1) % queueArray.length == head) {
            System.out.println("Overflow, queue full");
            System.exit(1);
        }
        queueArray[tail] = el;
        tail = (tail+1) % queueArray.length;
        currSize++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow, queue is empty");
            System.exit(1);
        }
        queueArray[head] = 0;
        head = (head+1) % queueArray.length;
        currSize--;
    }

    public int getHead() {
        return queueArray[head];
    }

    public int getTail() {
        if ((tail - 1) < 0) return queueArray[queueArray.length - 1];
        return queueArray[tail-1];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int size() {
        return currSize;
    }

    public void print() {
        for (int el : queueArray) System.out.println(el);
        System.out.println("Current size: " + size());
    }
}
