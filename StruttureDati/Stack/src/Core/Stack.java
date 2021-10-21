package Core;
import java.util.ArrayList;

public class Stack {


    private Integer top;
    private ArrayList <Integer> content;

    public  Stack(Integer n) {
        this.top = -1;
        this.content = new ArrayList<Integer>(n);
    }

    public boolean Is_empty() {
        return (this.top < 0);
    }

    public boolean Is_full() {
        if (this.top == (this.content.size()))
            return true;
        else
            return false;
    }

    public void Push( Integer i) {
        if (this.Is_full())
            return;
        this.content.add(i);
        this.top += 1;
    }

    public Integer Pop() {
        if (this.Is_empty())
            return null;
        Integer n;
        n = this.content.get(this.top);
        this.top -= 1 ;
        return n;
    }

    public Integer Size () {
        return this.top + 1;
    }

    public Integer Top() {
        if  (this.Is_empty()) {
            return null;
        }
        return this.top;
    }
}