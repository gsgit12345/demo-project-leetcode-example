package com.example.leetcode.numeric;

import java.util.Arrays;

//https://www.youtube.com/watch?v=oABQlhrhXzg
//https://www.youtube.com/watch?v=8RErc0VXAo8
public class RotateTheArrayByNTimeLeetCode {
    public static void main(String str[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int nums1[] = {-1,-100,3,99};
                int k1 = 2;

        System.out.println("array is ");
        rotateArray(nums1, k1);
        System.out.print("rotate array by ::"+k1 +":array after rotation:"+ Arrays.toString(nums1));
    }

    public static void rotateArray(int array[], int k) {
        k=k%array.length;
        if(k<0)
        {
            k=k+array.length;
        }
        swapArray(array,  0,array.length - k-1 );
       swapArray(array, array.length - k , array.length-1 );
        swapArray(array, 0, array.length-1 );


    }

    public static void swapArray(int array[], int start, int end) {

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
