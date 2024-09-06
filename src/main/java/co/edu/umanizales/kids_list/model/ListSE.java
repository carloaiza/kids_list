package co.edu.umanizales.kids_list.model;

import lombok.Data;

@Data
public class ListSE {
    private Node head;
    private int size;

    public void add(Kid kid){
        if(head == null){
            head = new Node(kid);
        }
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(kid));
        }
        size++;
    }

    public void addToStart(Kid kid){
        if(head == null){
            head = new Node(kid);
        }
        else{
            Node newNode = new Node(kid);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }


}
