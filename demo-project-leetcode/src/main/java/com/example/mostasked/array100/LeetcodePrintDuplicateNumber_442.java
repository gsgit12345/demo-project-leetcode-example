package com.example.mostasked.array100;

import java.util.ArrayList;
import java.util.List;

public class LeetcodePrintDuplicateNumber_442 {
    /*
    Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []

     */
    public static void main(String str[]) {
        //constraint=1 <= nums[i] <= n
        int num[] = {4, 3, 2, 7, 8, 2, 3, 1};
      List<Integer> un=  getDuplicate(num);
      System.out.println(un.toString());
    }

    public static List<Integer> getDuplicate(int array[]) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int index=Math.abs(array[i])-1;
            if(array[index]<0)
            {
                list.add(Math.abs(array[i]));
            }else
            {
                array[index]=-array[index];
            }
        }
        return list;
    }
}
