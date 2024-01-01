package com.example.leetcode.numeric;

import java.util.Arrays;

public class RemoveRepeatingElementFromArray {
    public static void main(String str[])
    {
        int  nums[] = {3,2,2,3};
        int val = 3;
        int []nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;

        //int count= removeRepeatingElementFromUnsortedArray(nums1,val1);
       //System.out.println("count is:;"+count+":array after remove::"+ Arrays.toString(nums1));
       //remove elemnet form sorted array
        int nums3[] = {1,1,2};
        //Output: 2, nums = [1,2,_]
        int[] nums4 = {0,0,1,1,1,2,2,3,3,4};

        int count1=removeRepeatingElementFromsortedArray(nums4);
        System.out.println("count is:;"+count1+":array after remove::"+ Arrays.toString(nums4));

    }
    public static int removeRepeatingElementFromUnsortedArray(int nums[],int val)
    {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != val)
            {

                nums[count]=nums[i];
                count++;
            }else {
                nums[i]='-';
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
    public static int removeRepeatingElementFromsortedArray(int nums[])
    {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            //if (nums[count] != nums[i])
            if(i<nums.length-1 && nums[i] ==nums[i+1])
            {
               // count++;

                //nums[count]=nums[i];
                continue;
            }
            nums[count]=nums[i];
            count++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
