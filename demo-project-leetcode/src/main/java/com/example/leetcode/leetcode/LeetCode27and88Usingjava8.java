package com.example.leetcode.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode27and88Usingjava8 {
    public static void main(String str[])
    {
        int nums []= {3,2,2,3};
        int val = 3;
        long result=leetCode27(nums,val);

        System.out.println(result);
        ///////////leetcode 28
        int num3[] = {0,0,1,1,1,2,2,3,3,4};
     leetCode28(num3);
    }
   public static long leetCode27(int array[],int val)
   {
      long count= Arrays.stream(array).filter(x->x!=val).count();

      return count;
   }
    public static void leetCode28(int array[])
    {
        long count= Arrays.stream(array).distinct().count();
System.out.println(Arrays.toString(array));
//remving duplicate using hashset

        List<Integer> items = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        Set<Integer> set = new HashSet<>(items.size());
        items.removeIf(p -> set.add(p));  //this will give duplicate element lying in the list
        System.out.println("using the removeiffunct::"+items);    //using the removeiffunct::[1, 3, 3, 6, 6]


        items.removeIf(p -> !set.add(p));  //this will give unique element lying in the  list removing the duplicate
        System.out.println("using the removeiffunct::"+items);    //[1, 2, 3, 4, 5, 6, 7, 8]


    }
}
