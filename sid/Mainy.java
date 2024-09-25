package com.sid;

public class Mainy {
    public static void main(String[] args) {
        LL list = new LL();
        list.Insert(3);
        list.Insert(5);
        list.Insert(8);
        list.Insert(10);
        list.InsertLast(56);
        list.Insert(14);
        list.Insert(19);
        list.Insert(21);
        list.Insu(1,2);
        list.Display();
        System.out.println(list.DeleteFirst());
        list.Display();
        list.InsecRec(88,3);
        list.Display();
    }
}
