package com.example.leetcode.numeric;

import java.util.Arrays;

public class MergedSortedArrayLeetCode {
    public static void main(String str[])
    {
        //https://www.youtube.com/watch?v=0H6038ldSyg&list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am
        int []nums1 = {1,2,3,4,5,0,0,0,0,0};
        int n = 5;
        int nums2[] = {2,5,6,7,8};
        int m = nums2.length;
        //ans:-[1, 2, 2, 3, 5, 6]
        int nums3[] = {1};
        int m1 = 1;
        int []nums4 = {};
        int n1 = 0;
//ans:-[1]
        int nums5[] = {0};
        int m3 = 0;
        int nums6[] = {1};
        int n3 = 1;

        mergedSortedArray(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void mergedSortedArray(int nums1[],int n,int nums2[],int m)
    {
        // time:-O(n+m) + O(n+m),
        //space-O(1),
        int i=n-1;
        int j=m-1;
        int k=m+n-1;
        while(j>=0 ) //run main loop with second array length
        {
           if( i>=0 && nums1[i]>nums2[j])
           {
               nums1[k]=nums1[i];
               k--;
               i--;
           }else {
               nums1[k]=nums2[j];
               k--;
               j--;
           }
        }
    }
    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        // Declare a 3rd array and 2 pointers:
       // time:-O(n+m) + O(n+m),
        //space-O(n+m) + O(n+m),
        long[] arr3 = new long[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        // If right pointer reaches the end:
        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        // If left pointer reaches the end:
        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }
    }
    public static void mergeOptimal(long[] arr1, long[] arr2, int n, int m) {
//https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/
        //       // time:-O(n+m) + O(n+m),
        //        //space-O(1) + O(n+m),
        // Declare 2 pointers:
        int left = n - 1;
        int right = 0;

        // Swap the elements until arr1[left] is
        // smaller than arr2[right]:
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }


}
