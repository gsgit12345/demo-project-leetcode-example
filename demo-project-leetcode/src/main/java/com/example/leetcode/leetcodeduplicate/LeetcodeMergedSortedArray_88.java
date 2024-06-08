package com.example.leetcode.leetcodeduplicate;

import java.util.Arrays;

public class LeetcodeMergedSortedArray_88 {
    public static void main(String str[])
    {
        int  nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
                int n = 3;
        //Output: [1,2,2,3,5,6]
     int arr[]=   mergedSortedArrayLeetCode88(nums1,m,nums2,n);

     System.out.println("array is::::"+Arrays.toString(arr));
    }

    public static int[] mergedSortedArrayLeetCode88(int array[],int m,int array2[],int n)
    {
       int k= m+n-1;
       int j=m-1;
       int i=n-1;
       while(i>=0)
       {
           if(j>=0 && array[j]>array2[i])
           {
               array[k]=array2[i];
               k--;
               j--;

           }else
           {
               array[k]=array2[i];
               k--;
               i--;
           }

       }

       return array;
    }
}
