package com.example.dsalevel1sumit.linkedList;

public class CustomeLinkedList {
    Node head;
    Node tail;
    int size;

    CustomeLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void display() {
       // Node temp = head;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public  void removeFirst()
    {
        //if list is empty ,print list is empty
        //if list has only 1 element.
        //if list has multiple element;
    }

    public void addFirst(int value) {
        //if there is no element in linked list.
        //if there is elemnet in linked list

        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;

        }
        size++;
    }
}
