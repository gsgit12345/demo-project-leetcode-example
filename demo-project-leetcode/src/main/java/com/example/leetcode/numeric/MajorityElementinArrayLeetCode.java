package com.example.leetcode.numeric;

//https://www.youtube.com/watch?v=1r8kzrXJiUk&list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am&index=5
//https://www.youtube.com/watch?v=YDlv6RnoSSA
public class MajorityElementinArrayLeetCode {
    public static void main(String str[])
    {
        //voting algorithm
        int nums[] = {3,2,3,2,2,3};
       // Output: 3
        int nums1[] = {2,2,1,1,1,2,2};

        int i= mazorityElementinArray(nums1);
       System.out.println(i);

    }
    public static int mazorityElementinArray(int array[])
    {
        //time=big(n)
        //space(big(1)
        int candidate=0;
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(count==0)
            {
                candidate=array[i];
            }
            if(candidate==array[i])
            {
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
