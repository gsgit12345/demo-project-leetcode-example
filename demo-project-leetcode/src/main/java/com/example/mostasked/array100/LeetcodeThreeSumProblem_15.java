package com.example.mostasked.array100;

import java.util.*;

public class LeetcodeThreeSumProblem_15 {
    public static void main(String str[]) throws Exception {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        //  Output: [[-1,-1,2],[-1,0,1]]
        //
        List<List<Integer>> result = threeSumProblem(nums);
        System.out.println(result.toString());
    }

    public static List<List<Integer>> threeSumProblem(int array[]) throws Exception {

        if (array.length == 0)
            throw new Exception("Triplet is not possible");
          Arrays.sort(array);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < array.length - 2; i++) {
            int j = 1;
            int k = array.length - 1;
            while (j < k) {
                int sum = array[i] + array[j] + array[k];
                if (sum == 0) {
                    result.add(Arrays.asList(array[i],array[j],array[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            //we need to handle duplicacy
        }
        return new ArrayList(result);
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0)
            return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) // duplicate check
                continue;
            int target = -nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    result.add(Arrays.asList(nums[low], nums[high], nums[i]));
                    while (low < high && nums[low] == nums[low + 1])
                        low++;
                    while (low < high && nums[high] == nums[high - 1])
                        high--;
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

