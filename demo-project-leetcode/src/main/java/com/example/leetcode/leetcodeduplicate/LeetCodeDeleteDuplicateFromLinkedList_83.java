package com.example.leetcode.leetcodeduplicate;

import com.example.dsalevel1sumit.linkedList.CustomeLinkedList;
import com.example.dsalevel1sumit.linkedList.Node;

public class LeetCodeDeleteDuplicateFromLinkedList_83 {

    public static void main(String str[])
    {
        //https://www.youtube.com/watch?v=uv0FHkp9lBU
CustomeLinkedList list=new CustomeLinkedList();
list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        CustomeLinkedList list2=new CustomeLinkedList();
        list2.addLast(1);
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(3);


        CustomeLinkedList list3=   removeDuplicateNodeFromSortedLinkedList(list2);
        list3.displayLinkedList();

    }
    public  static CustomeLinkedList removeDuplicateNodeFromSortedLinkedList(CustomeLinkedList linkedList)
    {
        Node temp=linkedList.head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return linkedList;
    }

}
