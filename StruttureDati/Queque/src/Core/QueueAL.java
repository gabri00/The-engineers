package Core;

import java.util.ArrayList;

public class QueueAL {

    private ArrayList<Integer> table;
    private int head;
    private int tail;
    private int lenght;

    public QueueAL(int n){
        this.head = 0;
        this.tail = 0;
        this.table = new ArrayList<Integer>(n);
        this.lenght = n;
        for(int i = 0; i<lenght; i++){
            this.table.add(0);
        }

    }

    public boolean isempty(){
        return this.head == this.tail;
    }

    public Integer head(){
        return this.table.get(this.head);
    }

    public Integer tail(){
        if (this.isempty())
            return 0;
        if(this.tail == 0)
            return this.table.get(this.lenght-1);
        return table.get(this.tail - 1);
    }

    public void enqueue(Integer x){
       if( ((this.tail + 1) % this.lenght) != this.head){
           this.table.set(this.tail, x);
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
            Integer x = this.table.get(this.head);
            this.head = (this.head + 1) % this.lenght;
            System.out.println("The element '" + x + "' was deleted");
            return x;
        }
    }
}
