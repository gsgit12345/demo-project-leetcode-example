package com.example.mostasked.array100;

public class LeetCodeMaximumWaterInContainer_11 {
    public static void main(String str[]) {
        // https://www.youtube.com/watch?v=EbkMABpP52U
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //  ans:- 49
        // Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
        //  In this case, the max area of water (blue section) the container can contain is 49.
        int maxcontainer = findTheMaximumWaterContainer(height);
        System.out.println(maxcontainer);
    }

    public static int findTheMaximumWaterContainer(int array[]) {
//1-traverse the array using two pointer approach
//2-Find the width subtracting from right ==right-left;
//3-find the minimum height in the array
//5-Multiply width*height and find the maximum of the max container
//6-Increment/decrement  the left or right if(height[left] <height[right]

        int right = 0;
        int left = array.length - 1;
        int answer = 0;
        while (right < left) {
            int width = left - right;
            int height = Math.min(array[right], array[left]);
            int maximumwater = width * height;
            answer = Math.max(answer, maximumwater);
            int inc = array[right] < array[left] ? right++ : left--;

        }
        return answer;
    }

    public static int findTheMaximumWaterContainerBruteForce(int array[]) {
        return 0;
    }
}
