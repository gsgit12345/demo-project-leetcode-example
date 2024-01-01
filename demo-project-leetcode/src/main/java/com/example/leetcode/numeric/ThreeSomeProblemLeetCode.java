package com.example.leetcode.numeric;

import java.util.*;

public class ThreeSomeProblemLeetCode {
    public static void main(String str[]) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        int nums1[] = {0, 1, 1};
        int nums2[] = {0, 0, 0};


        Set<List<Integer>> result = threeSomePairProblem(nums2);
        List<List<Integer>> result1 = threeSumLeetCode(nums);
        System.out.println("result is::" + result1.toString());

    }

    public static Set<List<Integer>> threeSomePairProblem(int array[]) {
        //https://www.youtube.com/watch?v=WdaeixEeAVs
        Set<List<Integer>> paire = new HashSet<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            int low = i + 1;
            int high = array.length - 1;
            int targetNum = -array[i];
            while (low < high) {
                if (array[low] + array[high] == targetNum) {
                    paire.add(Arrays.asList(array[low], array[high], array[i]));
                    low++;
                    high--;
                } else if (array[low] + array[high] < targetNum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return paire;
    }

    public static List<List<Integer>> threeSumLeetCode(int[] nums) {
//https://www.youtube.com/watch?v=z6K45IWBoBY
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0)
            return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) //duplicate check
                continue;
            int target = -nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    result.add(Arrays.asList(nums[low], nums[high], nums[i]));
                    while (low < high && nums[low] == nums[low + 1]) low++;//duplicate check
                    while (low < high && nums[high] == nums[high - 1]) high--;//duplicate check
                    low++;
                    high--;

                } else if (nums[low] + nums[high] < target)
                    low++;
                else
                    high--;
            }
        }

        return result;
    }
}

