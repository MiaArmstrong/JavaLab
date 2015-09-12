package com.company;

/**
 * Created by Mia on 2/26/2015.
 */
public class Linked_List extends List {

    protected Node head;


    public Linked_List() {
        head = null;
    }

    public void Build_List() {
        do {
            Node temp = new Node();
            temp.getInput();


            if (this.head == null) {
                this.head = temp;
            } else if (!(this.head.Less_Than(temp))) {
                temp.setNext(head);
                head = temp;
            } else {
                Node previous = this.head;
                Node current = this.head.getNext();
                while (current != null && current.Less_Than(temp)) {
                    previous = current;
                    current = current.getNext();
                }
                previous.setNext(temp);
                temp.setNext(current);

            }
            System.out.println("Add another? (y/n) ");
        } while (Again());
    }

    public void Display_List() {
        Node current = this.head;
        while (current != null) {
            current.displayPerson();
            current = current.getNext();
        }
    }

    public boolean Find(String match) {
        Node current = this.head;

        while (current != null && !current.equals(match))
            current = current.getNext();
        if (current != null) {
            System.out.println("\nThis is a match: ");
            current.displayPerson();
            return true;
        } else
            return false;
    }

    //Lab 8
    public int num_times() {
        Node current = removeLast(head);
        return getTotal(current, head);
    }

    protected Node removeLast(Node head) { //returns the last node in the list
        if (head == null)
            return null;

        if (head.getNext().getNext() == null) {
            head.setNext(null);
            return head;
        }
        removeLast(head.getNext());
        return head;


    }

    protected int getTotal(Node source, Node head) {
        if (head == null || source == null)
            return 0;
        if (head.name.equals(source.name))
            return getTotal(source, head.getNext()) + 1;
        else
            return getTotal(source, head.getNext());
    }


    public int remove_first_last() {
        if (this.head == null)
            return 0;
        if (this.head.getNext() == null) {
            this.head = null;
            return 1;
        }
        if (this.head.getNext().getNext() == null){
            this.head.setNext(null);
            this.head = null;
            return 2;
        }
        else {
            this.head = this.head.getNext();
            this.head = removeLast(this.head);

            return 2;
        }
    }
}




