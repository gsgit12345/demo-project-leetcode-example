package com.example.mostasked.searchingandsorting.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrayInToOneInSortedForm {
    public static void main(String str[]) {
        int arr1[] = {1, 3, 4, 5}, arr2[] = {6,7,8,9,10};

        //time:--Time Complexity : O(n1 + n2)
        //Auxiliary Space : O(n1 + n2)
        int result[] = meregTwoSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] meregTwoSortedArray(int array1[], int array2[]) {
        int result[] = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                k++;
                i++;

            } else {
                result[k] = array2[j];
                k++;
                j++;

            }
        }
        while (i < array1.length) {
            result[k] = array1[i];
            k++;
            i++;
        }
        while (j < array2.length) {
            result[k] = array2[j];
            k++;
            j++;
        }

        return result;
    }
}
