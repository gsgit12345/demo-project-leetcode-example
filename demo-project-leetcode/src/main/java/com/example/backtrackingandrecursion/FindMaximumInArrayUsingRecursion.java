package com.example.backtrackingandrecursion;

import java.util.Arrays;

public class FindMaximumInArrayUsingRecursion {
    //https://www.youtube.com/watch?v=obrreX-sQWo&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=17

    public static void main(String str[]) {
        int array[] = {1, 52, 13, 14, 5, 6, 7, 8};
        int index = 0;
        int max = findMaximum(array);
        System.out.println(max);
    }

    public static int findMax(int array[], int index)    // array,0,array,1,
    {
        if (index == array.length - 1) {
            return array[index];
        }

        int num = findMax(array, index + 1);
        if (num > array[index]) {
            return num;
        } else {
            return array[index];
        }
    }

    public static int findMaximum(int array[]) {

        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (max < array[i])
                max = array[i];


        return max;

    }
}
