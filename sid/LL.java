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
    public void Insu(int val, int index){
        if( index == 0){
            Insert(val);
            return;
        }
        if (index == size){
            InsertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1 ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void InsertLast(int value){
      if (tail == null){
          Insert(value);
          return;
    }
    Node node = new Node(value);
      tail.next = node;
      tail = node;
      size += 1;
    }
    public int DeleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
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
public void InsecRec(int val, int index){

        head = InsecRec(val, index, head);
    }
    public Node InsecRec(int val, int index, Node node ){
        if (index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;

        }
        node.next = InsecRec(val,index-1,node.next);
        return node;
    }
}
