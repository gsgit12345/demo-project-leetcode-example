package com.example.leetcode.leetcodeduplicate;

public class LeetcodeFindPeakElementInArrayl_162 {
    public static void main(String str[])
    {
        int nums[] = {1,2,3,1}; //ans-3 index=2
        int nums1[] = {1,2,1,3,5,6,4};  //ans=2 or 6 index=1 or 5
        int nums2[] = {1,2,3,4};  // ans--4 ,index---3
        int arr[] = { 1, 3, 20, 4, 1, 0 }; //20 ,index=2
        int array[]= {5, 10, 20, 15};//ans--20 ,index--2



        int index=findthePeakElementUsingBinarySearch(nums1);

        System.out.println("index is::"+index +":value is::"+nums1[index]);
    }
    public static int findthePeakElementUsingBinarySearch(int array[])
    {
        //https://leetcode.com/problems/find-peak-element/
        //big(logn)
        //big(1)
        //https://www.youtube.com/watch?v=RrGv2OPBl8U
        int low=0;
        int high=array.length-1;

        while(low<high)
        {
            //int mid=(low-high)/2; //this code will throw arrayindexoutofexception
            int mid=low+(high-low)/2; //this will not throw arrayindexoutofexception
            if(array[mid]>array[mid+1])
            {
                high=mid;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
    public static int findPeakElementUsingIterative(int array[])
    {
        //big(n)
        //big(1)
        for (int i = 0; i <array.length-1; i++){
            if (array[i] >array[i+1]) {
                return i;
            }
        }
        return array.length - 1;

    }
}
