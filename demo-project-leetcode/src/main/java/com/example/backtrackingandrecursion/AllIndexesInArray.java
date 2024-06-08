package com.example.backtrackingandrecursion;

import java.util.Arrays;

public class AllIndexesInArray {

    //https://www.youtube.com/watch?v=bQkwHBaNioE&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=24

    public static void main(String str[]) {
        int array[] = {3, 4, 5, 3, 2, 5, 8, 3, 9, 4, 10, 1, 1, 2};
        int arr[] = findtheAllMatchingIndexesInArray(array, 0, 2, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] findtheAllMatchingIndexesInArray(int array[], int idx, int find, int fcount) {
        if (idx == array.length) {
            return new int[fcount];
        }

        if (array[idx] == find) {
            int result[] = findtheAllMatchingIndexesInArray(array, idx + 1, find, fcount + 1);
            result[fcount] = idx;
            return result;
        } else {
            return findtheAllMatchingIndexesInArray(array, idx + 1, find, fcount);

        }
    }
}
