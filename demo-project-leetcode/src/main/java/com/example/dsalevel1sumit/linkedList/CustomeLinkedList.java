package com.example.dsalevel1sumit.linkedList;

public class CustomeLinkedList {
    public Node head;
    public Node tail;
    int size;
    Node rleft;

    public CustomeLinkedList() {
        head = new Node();
        tail = new Node();
    }

    public static void reverseLinkedListUsingRecursionUsingDataProperty(CustomeLinkedList list) {
        //https://www.youtube.com/watch?v=aL3l2-S9koY&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=205
    }

    public int size() {
        return size;
    }

    public void displayLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;

        }
    }

    public void addLast(int value) {
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

    public int removeFirst() {
        int data = 0;
        if (size() == 0) {
            System.out.println("List is Emty");
        } else if (size() == 1) {
            head = tail = null;
            size = 0;
        } else {
            data = head.data;
            head = head.next;
            size--;
        }
        return data;
    }

    public void addFirst(int value) {
//if list contains no element
        //if list contains the element

        Node temp = new Node();
        temp.data = value;
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void removeLast() {
        //if list does not contain no element
        //if list contains element
        //1 2 3 4 5
        if (size == 0) {

            System.out.println("list is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            temp = temp.next = null;
            tail = temp;
            size--;
        }


    }

    private Node getNode(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void reverseLinkedLIstUsingDataProperty() {
        Node prev = null;
        Node current = head;

        // At last prev points to new head
        while (current != null) {


            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // head = prev;


    }

    public CustomeLinkedList reverseLinkedLIstUsingAddress(CustomeLinkedList list) {

        //10,20,30,70
        Node current = list.head;
        Node previous = null;
        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        list.head = previous;
        return list;
    }

    public Node reverseLinkedListUsingRecursion(Node head) {
        //https://www.youtube.com/watch?v=ugQ2DVJJroc
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseLinkedListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public Node reverseLinkedListUsingRecursion2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseLinkedListUsingRecursion(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newNode;
    }

    public void removeAtIndex(int idx) {
        //if index does not exist
        //if list is empty
        //if list has only one element
        //if list has more than one element
        // 2 3 4 5 6 7
        if (idx == -1 || idx > size) {
            System.out.println("illegal argument exception.index does not exist");
        } else if (size == 0) {
            System.out.println("list is empty");
        } else if (size == 1) {
            removeFirst();

        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
//temp=head;
            size--;
        }


    }

    public void addAtParticularIndex(int idx, int value) {
        //if  list is empty or minus
        //if idx's value is 1 or last index
        //if index value is in middle
        //1 2 3 4 5
        if (idx == -1 || idx > size) {
            System.out.println("illegal argument exception.index does not exist");
        } else if (size == 0) {
            System.out.println("list is empty");
        } else if (size == 1) {
            addFirst(value);

        } else if (idx == size - 1) {
            addLast(value);
        } else {
            Node temp = head;
            Node node = new Node();
            node.data = value;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }


    }

    public int getFirst() {

        return head.data;
    }

    public int getLast() {
        return tail.data;
    }

    public int getAt(int idx) {
        //if idx is grater than size or idx is negative
        //if idx is 0 or 1;
        //list contains the multiple node;
        //if idx's  is the last element;
        Node temp = head;

        if (idx == -1 || idx > size) {
            System.out.println("invalid argument");
        } else if (size == 0) {
            System.out.println("list is empty");
        } else {
            for (int i = 0; i <= idx; i++) {
                temp = temp.next;
            }
        }


        return temp.data;
    }

    public int findKthNodeDataFromEnd(int idx) {
        //idx is -1 or greater than size
        //1 2 3 4 5 6
        Node temp = head;

        if (idx == -1 || idx > size) {
            System.out.println("invalid argument");
        } else {
            for (int i = size - 1; i > idx; i--) {
                temp = temp.next;
            }
        }
        return temp.data;
    }

    public int findKthNodeDataFromEndUsingTwoPointerApproach(int idx) {
        //idx is -1 or greater than size
        //1 2 3 4 5 6,7,8
        //https://www.youtube.com/watch?v=ZVtJu3DpZHU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=177
        //
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        while (fast != tail) {
            fast = fast.next;
            slow = slow.next;
        }


        return slow.data;
    }

    public int midNodeInLinkListUsingSizeProperty() {
        Node temp = head;
        for (int i = 0; i < (size / 2); i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int midNodeInLinkListUsingTwoPointerApproach() {
        //not use size property
        //in single traversal
        //in even case, return the last element in first half.
        //in odd case ,return the mid  element in the list
        //1 2 3 4 5
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public CustomeLinkedList mergeTwoSortedLinkedList(CustomeLinkedList list, CustomeLinkedList list2) {
        //  https://www.youtube.com/watch?v=6vFEuO1pfJA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=180

        Node firstHead = list.head;
        Node secondHead = list2.head;
        CustomeLinkedList result = new CustomeLinkedList();
        while (firstHead != null && secondHead != null) {
            if (firstHead.data < secondHead.data) {
                result.addLast(firstHead.data);
                firstHead = firstHead.next;
            } else {
                result.addLast(secondHead.data);
                secondHead = secondHead.next;
            }

        }
        while (firstHead != null) {
            result.addLast(firstHead.data);
            firstHead = firstHead.next;


        }
        while (secondHead != null) {
            result.addLast(secondHead.data);
            secondHead = secondHead.next;


        }

        return result;
    }

    public CustomeLinkedList mergeSortInLinkedList(CustomeLinkedList list) {
        //sort the list using merge sort
        //find the mid element
        //sort the list
        //mereg the list and return the sorted list


        CustomeLinkedList sortedList = new CustomeLinkedList();
        return sortedList;
    }

    public CustomeLinkedList removeDuplicateNodeFromSortedLinkedList(CustomeLinkedList linkedList) {
        Node temp = linkedList.head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return linkedList;
    }

    public CustomeLinkedList rearrangeEvenAndOddNodes(CustomeLinkedList list) {
        //https://www.geeksforgeeks.org/rearrange-a-linked-list-such-that-all-even-and-odd-positioned-nodes-are-together/
        //https://www.youtube.com/watch?v=calrG6RJ9qI&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=186
        return null;
    }

    public LinkedListDemo rearrangeLinkedListInKgROUP(CustomeLinkedList linkedList) {
        // https://www.youtube.com/watch?v=nYHOtT1Tdns
        return null;
    }

    public void printLinkedLIstInReverseOrder(Node list) {
        //https://www.youtube.com/watch?v=kgmHuB6w0PM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=193

        Node temp = list;
        if (temp == null) return;
        printLinkedLIstInReverseOrder(list.next);
        System.out.print(temp.data);
    }

    public CustomeLinkedList reverseLInkedListIterative(CustomeLinkedList list) {
        // 1 2 3 4 5 6
//6,5,4,3,2,1
        //https://www.youtube.com/watch?v=t7YaoQOFXzk
        if (list.head == null || list.head.next == null) return list;
        Node currentNode = list.head.next;
        Node previous = list.head;
        while (currentNode != null) {
            Node tempNode = currentNode.next;
            currentNode.next = previous;

            // updating the value or swapping
            previous = currentNode;
            currentNode = tempNode;

        }
        list.head.next = null;
        list.head = previous;
        return list;
    }

    public void reverseLinkedListUsingDataPropertyUsingRecursionHelper(Node right, int flor) {

        //https://www.youtube.com/watch?v=aL3l2-S9koY&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=205
        // time complexity big(n)
        if (right == null)
            return;
        reverseLinkedListUsingDataPropertyUsingRecursionHelper(right.next, flor + 1);
        //here we are using flore to stop the swap
        //here rleft is in the heap ,not in the stack
        //right is in the stack
        //here we had use the flor property to stop the execution in the mid.
        //call stack would be stored in the stack and there is multiple right at each call stack
        //swap the value between right and left and increment the rleft pointer
        if (flor >= size() / 2) {
            int temp = right.data;
            right.data = rleft.data;
            rleft.data = temp;
            rleft = rleft.next;
        }
    }

    public void reverseLinkedListUsingDataPropertyUsingRecursion(Node right) {
        rleft = head;

        reverseLinkedListUsingDataPropertyUsingRecursionHelper(head, 0);
    }

    private boolean isLinkedListPalindrom(Node right, int flor) {

        if (right == null)
            return true;
        boolean result = false;
        boolean isTrue = isLinkedListPalindrom(right.next, flor + 1);
        if (isTrue == false) {
            result = false;
        } else if (right.data != rleft.data) {
            result = false;
        } else {
            rleft = rleft.next;
            result = true;
        }
        return result;
    }

    public boolean linkedListPalindrom(Node head) {
        //https://www.youtube.com/watch?v=p-g75-QgTI0&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=209
        //        Input: R->A->D->A->R->NULL
        //      Output: Yes
        //  Input: C->O->D->E->NULL
        // Output: No
        //1 2 3 2 1   --output -yes
        rleft = head;
        boolean isTRue = isLinkedListPalindrom(head, 0);
        return isTRue;
    }

    private void foldOrRearrangeLinkedLIstHelper(Node right, int flor) {
        if (right == null) {
            return;
        }
        foldOrRearrangeLinkedLIstHelper(right.next, flor + 1);

        if (flor > size() / 2) {
            Node temp = rleft.next;
            rleft.next = right;
            right.next = temp;

            rleft = temp;
        } else if (flor == size() / 2) {
            tail = right;
            tail.next = null;
        }


    }

    public void foldOrRearrangeLinkedLIst(Node head) {
        //https://www.youtube.com/watch?v=U4M9O8UxB6I&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=211
        //Input:  1 -> 2 -> 3 -> 4
        //Output: 1 -> 4 -> 2 -> 3
        //Input:  1 -> 2 -> 3 -> 4 -> 5
        //Output: 1 -> 5 -> 2 -> 4 -> 3
        rleft = head;
        foldOrRearrangeLinkedLIstHelper(head, 0);
    }

    public void addTwoLinkedList(CustomeLinkedList list, CustomeLinkedList list2) {
        //https://www.youtube.com/watch?v=tK4eez3syAQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=217
        // no use of array
        // no reverse
        //do not convert into integer
    }

    public void subtractTwoLinkedList(CustomeLinkedList list, CustomeLinkedList list2) {
        //https://www.youtube.com/watch?v=tK4eez3syAQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=217
        // no use of array
        // no reverse
        //
    }

    public void multiplyTwoLinkedList(CustomeLinkedList list, CustomeLinkedList list2) {
        //https://www.youtube.com/watch?v=tK4eez3syAQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=217
        // no use of array
        // no reverse
        //
    }

    public void divideTwoLinkedList(CustomeLinkedList list, CustomeLinkedList list2) {
        //https://www.youtube.com/watch?v=tK4eez3syAQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=217
        // no use of array
        // no reverse
        //
    }

    public void intersectionOfTwoLinkedList(CustomeLinkedList list, CustomeLinkedList list2) {
        //https://www.youtube.com/watch?v=B4aqNarb0QQ&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=221
        // no use of array
        // no reverse
        //
    }
}
