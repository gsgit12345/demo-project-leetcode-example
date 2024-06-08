package com.example.dsalevel1sumit.linkedList;

public class LinkedListDemo {
    public static void main(String str[])
    {
       CustomeLinkedList list=new CustomeLinkedList();

       list.addFirst(10);
       list.addFirst(20);
       list.display();
       System.out.println("size is:::"+list.size());
    }
}
