

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(){
        head = tail = null;
    }

    public boolean isEmpty(){return head == null;}

    public Integer Head(){
        if(isEmpty()){
            System.out.println("The list is empty");
            return -1;
        }
        return head.getKey();
    }

    public Integer Tail(){
        if(isEmpty()){
            System.out.println("The list is empty");
            System.exit(1);;
        }
        return tail.getKey();
    }

    public void insertFront(Integer key){
        Node n = new Node(key,null, this.head);
        if (isEmpty())
            head = tail = n;
        else{
            head.setPrev(n);
            head = n;
        }
    }

    public void insertBack(Integer key){
        Node n = new Node(key, tail, null);
        if (isEmpty())
            head = tail = n;
        else{
            tail.setNext(n);
            tail = n;
        }
    }

    // We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
    // In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the
    // comparison of values in the objects

    public Node ListSearch(Integer key){
        Node n = head;
        while(n  != null && !(n.getKey().equals(key)))
            n  = n.getNext();
        return n;
    }

    public boolean search(Integer key){
        Node n = ListSearch(key);
        return (n != null);
    }

    public void ListDelete(Node n){
        if(n.getPrev() != null)
            n.getPrev().setNext(n.getNext());
        else
            head = n.getNext();
        if(n.getNext() != null)
            n.getNext().setPrev(n.getPrev());
        else
            tail = n.getPrev();
    }

    public void Delete(Integer key){
        Node n = ListSearch(key);
        if(n != null)
            ListDelete(n);
    }

    public Integer DeleteFront(){
        if (isEmpty()){
            System.out.println("The list is empty");
            System.exit(1);
        }
        Integer a = head.getKey();
        ListDelete(head);
        return a;
    }

    public Integer DeleteBack(){
        if (isEmpty()){
            System.out.println("The list is empty");
            System.exit(1);
        }
        Integer a = tail.getKey();
        ListDelete(tail);
        return a;
    }
    public void print() {
        if(!isEmpty()) {
            System.out.println("Head: " + Head());
            System.out.println("Tail: " + Tail());

            Node n = head;
            while (n != null) {
                System.out.println(n.getKey());
                n = n.getNext();
            }
        }
        else
            System.out.println("The list is empty");
    }

}
