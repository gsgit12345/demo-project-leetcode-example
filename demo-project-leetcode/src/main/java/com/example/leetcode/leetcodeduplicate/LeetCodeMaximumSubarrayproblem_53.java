package com.example.leetcode.leetcodeduplicate;

public class LeetCodeMaximumSubarrayproblem_53 {
    public static void main(String str[]) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};//ans==6
        int nums1[] = {1};

        int nums2[] = {5,4,-1,7,8}; //ans-23


        System.out.println("max subarray::" + maximumSumArray(nums2));
        System.out.println("max subarray second ::" + maxSubArray(nums));

    }

    public static int maximumSumArray(int array[]) {
        //https://www.youtube.com/watch?v=usxn9PV6Fdo
        //big(n)
        //big(1)
        int sum = 0;
        int max_sum = array[0];
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }
    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int max_sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            //cleaner and simple
            sum = Math.max(nums[i], sum + nums[i]);

            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }

}
