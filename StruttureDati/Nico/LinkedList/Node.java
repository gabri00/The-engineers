package Core;

public class Node {

    private Integer key;
    private Node prev;
    private Node next;


    public Node(Integer key, Node prev, Node next) {
        this.key = key;
        this.prev = prev;
        this.next = next;
    }
    public Integer getKey() {
        return key;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
