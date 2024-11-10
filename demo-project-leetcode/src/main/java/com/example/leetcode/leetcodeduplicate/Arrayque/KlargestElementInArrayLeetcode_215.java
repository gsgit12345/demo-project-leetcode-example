package com.example.leetcode.leetcodeduplicate.Arrayque;

import java.util.PriorityQueue;
import java.util.Queue;

public class KlargestElementInArrayLeetcode_215 {
    public static void main(String str[])
    {
        int nums[] = {3,2,1,5,6,4}, k = 2;
        int nums1[] = {3,2,3,1,2,4,5,5,6}, k1 = 4;


    }
    public static int kthLargestElementInArrayInSortedOrder(int array[],int k)
    {
        Queue<Integer> priorityQueue= new PriorityQueue();
        for(int i=0;i<array.length;i++)
        {
            if(i<k)
            {
                priorityQueue.add(array[i]);
            }else
            {

            }


        }

        return 0;

    }
}
