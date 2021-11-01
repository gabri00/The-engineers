public class LinkedList {
    private Node head, tail;

    public LinkedList() {
        head = tail = null;
    }

    public void insertFront(final int el) {
        Node newNode = new Node(el, head, null);

        if (isEmpty()) head = tail = newNode;
        else {
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void insertBack(final int el) {
        Node newNode = new Node(el, null, tail);

        if (isEmpty()) head = tail = newNode;
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Empty list");
            System.exit(1);
        }

        if (head != tail) {
            Node n = head;
            head = n.getNext();
            head.setPrev(null);
            n.setNext(null);
        }
        else head = tail = null;
    }

    public void deleteBack() {
        if (isEmpty()) {
            System.out.println("Empty list");
            System.exit(1);
        }

        if (head != tail) {
            Node n = tail;
            tail = n.getPrev();
            tail.setNext(null);
            n.setPrev(null);
        }
        else head = tail = null;
    }

    public boolean search(final int el) {
        return listSearch(el) != null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getHead() {
        if (isEmpty()) {
            System.out.println("Empty list");
            System.exit(1);
        }
        return head.getKey();
    }

    public int getTail() {
        if (isEmpty()) {
            System.out.println("Empty list");
            System.exit(1);
        }
        return tail.getKey();
    }

    public void print() {
        if(!isEmpty){
            System.out.println("\nHead: " + getHead());
            System.out.println("Tail: " + getTail());

            Node n = head;
            while (n != null) {
                System.out.println(n.getKey());
                n = n.getNext();
            } else 
                System.out.println("The list is empty");
        }
    }

    private Node listSearch(final int el) {
        Node temp = head;
        while (temp != null && temp.getKey() != el) temp = temp.getNext();
        return temp;
    }
}
