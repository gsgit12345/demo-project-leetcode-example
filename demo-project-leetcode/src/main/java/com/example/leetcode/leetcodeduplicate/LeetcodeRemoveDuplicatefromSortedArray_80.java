package com.example.leetcode.leetcodeduplicate;

public class LeetcodeRemoveDuplicatefromSortedArray_80 {

    public static void main(String str[]) {
        int nums[] = {1, 1, 1, 2, 2, 3};
        int nums2[] = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        int duplicate = removeDuplicateFromSortedArray(nums2);
        System.out.println("duplicate is:::" + duplicate);

    }

    public static int removeDuplicateFromSortedArray(int array[]) {
        //https://www.youtube.com/watch?v=BLFvXsBf5uM
        int i = 0;

        for (int n : array) {
            if (i < 2 || n != array[i - 2]) {
                array[i] = n;
                i++;
            }
        }
        return i;
    }


}
