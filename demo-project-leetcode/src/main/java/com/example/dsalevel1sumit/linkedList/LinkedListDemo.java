package com.example.dsalevel1sumit.linkedList;

public class LinkedListDemo {
    public static void main(String[] str) {
        CustomeLinkedList list = new CustomeLinkedList();

        list.addLast(1);
        list.addLast(1);

        list.addLast(2);
        list.addLast(3);
        list.addLast(3);

        list.addLast(4);
        list.addLast(4);


        CustomeLinkedList list2 = new CustomeLinkedList();

        list2.addLast(10);
        list2.addLast(20);
        list2.addLast(30);
        list2.addLast(70);

        //  list.displayLinkedList();
        // System.out.println("size is:::"+list.size());
        // list.removeFirst();
        // list.displayLinkedList();
        //  System.out.println("after removing  is:::"+list.size());
        // list.addFirst(40);
        // System.out.println("after adding the first  is:::"+list.size());
        //  list.displayLinkedList();

        // list.addLast(80);
        //list.displayLinkedList();

        //  list.removeLast();
        //list.removeAtIndex(1);
        // list.displayLinkedList();
      //  list.addAtParticularIndex(2, 19);
      //  list.displayLinkedList();

        System.out.println("remove last adding the first  is:::" + list.size());
//list.reverseLinkedLIstUsingAddress();
        //  int data = list.findKthNodeDataFromEnd(3);
       // int data = list.midNodeInLinkListUsingTwoPointerApproach();

       // CustomeLinkedList list3= list.mergeTwoSortedLinkedList(list,list2);
       //  list.head= list.reverseLinkedListUsingRecursion(list2.head); //using recursion
       // list.head= list.reverseLinkedListUsingRecursion2(list2.head); //using recursion

     // list.printLinkedLIstInReverseOrder(list.head);

        //CustomeLinkedList list3=list.reverseLInkedListIterative(list);
       // list.reverseLinkedListUsingDataPropertyUsingRecursion(list.head);
                //1 2 3 2 1   --output -yes
        //1 2 1 2 1    yes
        CustomeLinkedList  plist=new CustomeLinkedList();
        plist.addFirst(1);
        plist.addFirst(2);
        plist.addFirst(3);
        plist.addFirst(2);
        plist.addFirst(1);
     //  plist.displayLinkedList();
//4 2 5 6
        CustomeLinkedList  plist2=new CustomeLinkedList();
        plist2.addFirst(4);
        plist2.addFirst(2);
        plist2.addFirst(5);
        plist2.addFirst(6);
        plist2.addFirst(1);
       // plist2.displayLinkedList();
    //  boolean isPalindrom=  plist.linkedListPalindrom(plist.head);
      //System.out.println(isPalindrom);
      //rearrange a linkedlist or fold a linked list
        //Input:  1 -> 2 -> 3 -> 4
        //Output: 1 -> 4 -> 2 -> 3
        CustomeLinkedList  pfold=new CustomeLinkedList();
        pfold.addLast(1);
        pfold.addLast(2);
        pfold.addLast(3);
        pfold.addLast(4);
        pfold.displayLinkedList();
        pfold.foldOrRearrangeLinkedLIst(pfold.head);

        pfold.displayLinkedList();


        //  list.displayLinkedList();
      // System.out.println("data from back is:::" + data);

//list.displayLinkedList();;


    }
}
