package Core;

public class Set {
    private boolean[] table;
    private int size;
    private int pippo;


    public Set(int n){
        size = 0;
        table = new boolean[n];
    }

    public int size(){
        return size;
    }

    public void add(int el){
        if( el > table.length || el < 0){
            System.out.println("The element is out of bonds from the Set");
            return;
        }
        if(!table[el]){
            table[el] = true;
            size++;
        }
    }
    public void remove(int el){
        if(el > table.length || el < 0){
            System.out.println("The element is out of bonds from the Set");
            return;
        }
        if(table[el]){
            table[el] = false;
            size--;
        }
    }

    public boolean contains(int el){
        if(el > table.length || el < 0){
            System.out.println("The element is out of bonds from the Set");
            return false;
        }
        return table[el];
    }

    public void print(){
        for(int i = 0; i < table.length; i++){
            System.out.print(table[i] + " ");
        }
    }

    public Set union(Set s){
        if(this.table.length != s.table.length){
            System.out.println("You can't unite two set of different domain");
            return null;
        }
        Set c = new Set(table.length);
        for(int i = 0; i < table.length; i++)
            c.table[i] = this.table[i] || s.table[i];
        return c;
    }

    public Set intersect(Set s){
        if(this.table.length != s.table.length){
            System.out.println("You can't unite two set of different domain");
            return null;
        }
        Set c = new Set(table.length);
        for(int i = 0; i < table.length; i++)
            c.table[i] = this.table[i] && s.table[i];
        return c;
    }

    public Set diff(Set s){
        if(this.table.length != s.table.length){
            System.out.println("You can't unite two set of different domain");
            return null;
        }
        Set c = new Set(table.length);
        for(int i = 0; i < table.length; i++)
            c.table[i] = this.table[i] && !s.table[i];
        return c;
    }

    public Set complement(){
        Set c = new Set(table.length);
        for(int i = 0; i < table.length; i++)
            c.table[i] = !table[i];
        return c;
    }

}
