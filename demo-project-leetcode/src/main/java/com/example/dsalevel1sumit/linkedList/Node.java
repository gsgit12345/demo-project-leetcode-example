package com.example.dsalevel1sumit.linkedList;

public class Node {
  public   int data ;
   public  Node next;
    Node(int val, Node next)
    {
        this.data = val;
        this.next = next;
    }
    Node() {}
    Node(int val) { this.data = val; }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

