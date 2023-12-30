package com.example.leetcode.numeric;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeTwoSumProblem {
    public static void main(String str[])
    {
        //time=big(n),space=big(n)
        int array[]={2,7,11,15};
        int target=9;
        int array1[]={3,2,4};
        int target1=6;
       int result[]= twoSumProblem(array1,target1);
       System.out.println(Arrays.toString(result));

    }
    public static int[] twoSumProblem(int [] array,int target)
    {
        if(array==null)
            return new int[]{};
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
           int sum=target-array[i];
           if(hashMap.containsKey(array[i]))
           {
               return  new int[]{hashMap.get(array[i]),i};
           }else {
               hashMap.put(sum,i);
           }
        }
        return  new int[]{};
    }
}
