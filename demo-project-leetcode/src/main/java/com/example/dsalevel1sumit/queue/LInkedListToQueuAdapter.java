package com.example.dsalevel1sumit.queue;

import com.example.dsalevel1sumit.linkedList.CustomeLinkedList;

public class LInkedListToQueuAdapter {
    CustomeLinkedList  list;

    public LInkedListToQueuAdapter()
    {
        list=new CustomeLinkedList();
    }
    public int size()
    {
        return list.size();
    }
    public void add(int value)
    {
      list.addLast(value);
    }
    public int peek()
    {
        return list.getFirst();
    }
    public void  remove()
    {
         list.removeFirst();
    }
//all are big(1);
}
