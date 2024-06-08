package com.example.leetcode.leetcodeduplicate;

import java.util.Arrays;

public class LeetcodeRotateanArray_189 {
    public static void main(String str[])
    {

        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int nums2[] = {1,2,3,4,5,6,7};
        int k2 = 13;

        int mod=13%5;
        System.out.println("mode is ::"+mod);

System.out.println("before rotation array is:::"+ Arrays.toString(nums));

        int arr[]=rotateArrayLeetCode189(nums2,k2);

        System.out.println("after rotation array is:::"+ Arrays.toString(arr));


    }
    public static int[] rotateArrayLeetCode189(int array[],int k)
    {
        //https://www.youtube.com/watch?v=TYT5TJSfGlo&t=624s
        //https://walkccc.me/LeetCode/problems/189/#__tabbed_1_2

        //1- if is greater than length of the array
        //time==big(n)
        //space=big(1)

        k=k%array.length;

        //2- if k's value is in minus.
        if(k<0)
        {
            k=k+array.length;
        }
System.out.println("k is :::"+k);
        rotateArray(array,0,array.length-1);//
        rotateArray(array,0,k-1);
        rotateArray(array,k,array.length-1);

        return array;

    }

    public static int[] rotateArray(int array[],int start,int end)
    {
        while(start<=end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }
        return array;

    }
}
