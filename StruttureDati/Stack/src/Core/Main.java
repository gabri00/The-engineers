package Core;

public class Main {
    public static void main ( String[] args) {
        Stack s = new Stack(10);

        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        System.out.println("La posizione al top é: " +  s.Top());
        System.out.println("La dimensione della pila é : " + s.Size());
        System.out.println("Faccio un pop: " + s.Pop());
    }

}
