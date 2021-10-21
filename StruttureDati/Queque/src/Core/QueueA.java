package Core;

public class QueueA {

    private Integer[] table;
    private int head;
    private int tail;
    private int lenght;

    public QueueA(int n){
        this.head = 0;
        this.tail = 0;
        this.table = new Integer[n];
        this.lenght = n;
    }

    public boolean isempty(){
        return this.head == this.tail;
    }

    public Integer head(){
        return this.table[this.head];
    }

    public Integer tail(){
        if (this.isempty())
            return 0;
        if(this.tail == 0)
            return this.table[this.lenght-1];
        return table[(this.tail - 1)];
    }

    public void enqueue(Integer x){
        if( ((this.tail + 1) % this.lenght) != this.head){
            this.table[this.tail] = x;
            this.tail = ((this.tail + 1) % this.lenght);
            System.out.println("The element: '" + x + "' was added");

        }
        else{
            System.out.println("The queue is full, the element '" + x + "' was not added");
        }
    }

    public Integer dequeue(){
        if (this.isempty()){
            System.out.println("The queue is empty so no element was dequeued");
            return null;
        }
        else{
            Integer x = this.table[this.head];
            this.head = (this.head + 1) % this.lenght;
            System.out.println("The element '" + x + "' was deleted");
            return x;
        }
    }
}
