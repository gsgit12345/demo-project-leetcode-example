package com.example.mostasked.array100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeTwoSumProblem_1 {
    public static void main(String str[])
    {
        int nums[] = {2,7,11,15,13}, target = 9;
        //Output: [0,1]
       // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int nums1[] = {3,2,4}, target1 = 6;
       // Output: [1,2]
        //Example 3:

        int nums2[] = {3,3}, target2 = 6;
        //Output: [0,1]
   // int arr[]=    twoSumEqualToTarget(nums,target);
       int arr[]= twoSumProblemBigNSolution(nums2,target2);
    System.out.println("received array::"+Arrays.toString(arr));
   // System.out.println("firstelemnt::"+nums[arr[0]]+":secondelemnt:"+nums[arr[1]]+":and sum is::"+(nums[arr[0]]+nums[arr[1]]));
    }

    public static int[] twoSumEqualToTarget(int array[],int target)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=1;j<array.length;j++)
            {
                if(array[i]+array[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumProblemBigNSolution(int array[],int target)
    {
        //space-big(n)
        //time-big(n)
        Map<Integer,Integer> hasMap=new HashMap<>();
        for(int i=0;i<array.length;i++ )
        {
            int nextElement=target-array[i];
            if(hasMap.containsKey(nextElement))
            {
                return new int[]{hasMap.get(nextElement),i};
            }
            hasMap.put(array[i],i);
        }
        return new int[]{};
    }
}
