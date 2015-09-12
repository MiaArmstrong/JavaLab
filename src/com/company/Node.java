package com.company;

/**
 * Created by Mia on 2/26/2015.
 */
public class Node extends Person{

    private Node next;

    public Node(){
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean Less_Than(Node toCompare){
        int result = this.name.compareToIgnoreCase(toCompare.name);
        if(result >= 0)
            return true;
        else
            return false;
    }
}
