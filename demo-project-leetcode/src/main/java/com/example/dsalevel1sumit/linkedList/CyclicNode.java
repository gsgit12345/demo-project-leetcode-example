package com.example.dsalevel1sumit.linkedList;

public class CyclicNode {
    int element;
    CyclicNode next;
    public CyclicNode()
    {
        next =new CyclicNode();
    }

}
