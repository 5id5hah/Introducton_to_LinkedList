package com.sid;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void Insert(int value){
        Node n = new Node(value);
        n.next = head;
        head = n;
        if ( tail == null){
        tail = head;
        }
        size += 1;
    }
    public void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


private class Node{
    private int value;
    private Node next;
    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}
}
