package Core;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphLList {

    private ArrayList<LinkedList<Integer>> content;

    public GraphLList(int n){
        content = new ArrayList<LinkedList<Integer>>(n);
        for (int i = 0 ; i < n; i++){
            LinkedList<Integer> ll = new LinkedList<Integer>();
            content.add(ll);
        }
    }

    public void link(int u,int v){
        if(!content.get(u).contains(v)){
            if ( u < content.size() && v < content.size() ) {
                content.get(u).addFirst(v);
            } else
                System.out.println("This link can't exist, out of bounds");
        }
    }

    public void unLink(int u,int v){
        if ( u < content.size() && v < content.size() ) {
            if (content.get(u).contains(v)) {
                content.get(u).remove(content.get(u).indexOf(v));
            }
        } else
            System.out.println("This link can't exist, out of bounds");
    }
    public boolean areLinked(int u,int v){
        if ( u < content.size() && v < content.size() ) {
            return content.get(u).contains(v);
        } else
            System.out.println("This link can't exist, out of bounds");
                return false;
    }

    public int size(){
        return content.size();
    }

    public void print(){
        if (this != null) {
            for (int i = 0; i < content.size(); i++) {
                System.out.print(i + " ----> ");
                for (int j = 0; j < content.get(i).size(); j++) {
                    System.out.print(content.get(i).get(j));
                    if(j == (content.get(i).size()-1))
                        break;
                    System.out.print(" --> ");
                }
                System.out.println("");
            }
        }
    }
}
