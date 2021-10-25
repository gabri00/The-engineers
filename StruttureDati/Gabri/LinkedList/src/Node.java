public class Node {
    private int key;
    private Node next;
    private Node prev;

    public Node(int key, Node next, Node prev) {
        this.key = key;
        this.next = next;
        this.prev = prev;
    }

    public int getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
