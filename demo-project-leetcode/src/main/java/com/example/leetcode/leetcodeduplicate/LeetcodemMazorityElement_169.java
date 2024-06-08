package com.example.leetcode.leetcodeduplicate;

public class LeetcodemMazorityElement_169 {
    public static void main(String str[]) {
        //moors voting algorithmn
        int nums[] = {3, 2, 3,2,2};
        int  nums2[] = {2,2,1,1,1,2,2};


        System.out.println(getMajorityElementInArray(nums2));
    }

    public static int getMajorityElementInArray(int array[]) {
        //https://www.youtube.com/watch?v=1r8kzrXJiUk&t=98s
        //https://walkccc.me/LeetCode/problems/169/
        int vote = 0;
        int candidate = 0;

        for (int i = 0; i < array.length; i++) {
            if (vote == 0) {
                candidate = array[i];
            }
            if (candidate == array[i]) {
                vote--;
            } else {
                vote++;
            }
        }
        return candidate;
    }
}
