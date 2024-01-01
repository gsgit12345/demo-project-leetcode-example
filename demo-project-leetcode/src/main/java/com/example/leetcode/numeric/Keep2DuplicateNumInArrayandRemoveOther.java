package com.example.leetcode.numeric;

import java.util.Arrays;

public class Keep2DuplicateNumInArrayandRemoveOther {
    public static void main(String str[])
    {
        int nums[] = {1,1,1,2,2,2,3,3,3,4,3};

      int count=  keep2RepeatingElementInArray(nums);
      System.out.println("count is::"+count+":array after:"+ Arrays.toString(nums));
    }
    public static int keep2RepeatingElementInArray(int nums[])
    {
        int count=0;
        for(int element:nums)
        {
            if(count<2|| element!=nums[count-2])
            {
                nums[count]=element;
                count++;
            }


        }
        return count;
    }
}
