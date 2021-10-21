package Core;

public class Main {
    public static void main ( String[] args) {
        QueueA q = new QueueA(5);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.enqueue(1);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.enqueue(2);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.enqueue(3);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.enqueue(4);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.enqueue(5);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.dequeue();
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
        q.enqueue(5);
        System.out.println("The head element (the one ready to go) is: " + q.head());
        System.out.println("The tail element (the one just arrived) is: " + q.tail());
    }

}
