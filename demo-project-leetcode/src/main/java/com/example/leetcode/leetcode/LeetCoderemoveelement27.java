package com.example.leetcode.leetcode;

import java.util.Arrays;
import java.util.stream.Collector;

public class LeetCoderemoveelement27 {
    public static void main(String str[])
    {
        //remove element in place
        int nums []= {3,2,2,3};
                int val = 3;
      int num=  removeElementLeetCode27(nums,val);
      System.out.println("num is:::"+num);
      ////remove duplicate from sorted array
        int num3[] = {0,0,1,1,1,2,2,3,3,4};

       int numberofelementremoved= removeDuplicateFromSortedArray26(num3);

       System.out.println("number of element:"+numberofelementremoved);


    }
    public static int  removeElementLeetCode27(int arr[],int val)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[count]=arr[i];
                count++;


            }
        }
System.out.println(Arrays.toString(arr));
return count;
    }
    public static int removeDuplicateFromSortedArray26(int array[])
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=array[count])
            {
                count++;
                array[count]=array[i];
            }
        }

        //using java 8
       int uniq[]= Arrays.stream(array).distinct().toArray();
        System.out.println("using java 8:::"+Arrays.toString(uniq));

        return  count;
    }
}
