package com.example.backtrackingandrecursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversingArrayUsingRecursion {
    public static void main(String str[]) {
        int array[] = {1, 2, 13, 4, 5, 6, 7, 8};
        reverseArrayUsingREcursion(array, 0);

        int reverse[] = reverseArrayUsingREcursion2(array, 0, array.length - 1);

        System.out.println("reverse::" + Arrays.toString(reverse));

    }

    public static void reverseArrayUsingREcursion(int array[], int index) {

        if (index == array.length) {
            return;

        }
        reverseArrayUsingREcursion(array, index + 1);
        System.out.print(array[index] + " ");

    }

    public static int[] reverseArrayUsingREcursion2(int array[], int index, int last) {
        //https://jminded.com/reversing-an-array-using-recursion-in-java/
        if (index < last) {
            int temp = array[last];
            array[last] = array[index];
            array[index] = temp;
            reverseArrayUsingREcursion2(array, index + 1, last - 1);

        }
        return array;
    }

}
