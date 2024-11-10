package com.example.mostasked.searchingandsorting.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String str[]) {
        int array[] = {2, 5, 6, 1, 8, 3, 12, 89};
        int left = 0;
        int right = array.length-1;
      int result[]=  mergeSort(array,left,right);
      System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int array[], int left, int right) {
       if(left==right) {
           int[] base= new int[1];
           base[0]=array[left];
           return base;
       }
        int mid = (left + right) / 2;

        int array1[] = mergeSort(array, left, mid);
        int array2[] = mergeSort(array, mid + 1, right);
        return mergingArray(array1, array2);
    }

    public static int[] mergingArray(int array1[], int array2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int result[] = new int[array1.length + array2.length];
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
        if (i < array1.length) {
            result[k] = array1[i];
            i++;
            k++;
        }
        if (j < array2.length) {
            result[k] = array2[j];
            j++;
            k++;
        }
       // System.out.println("result:;"+Arrays.toString(result));
        return result;
    }
}
