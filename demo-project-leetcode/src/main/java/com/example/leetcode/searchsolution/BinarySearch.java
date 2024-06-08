package com.example.leetcode.searchsolution;

public class BinarySearch {
    public static void main(String str[]) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int key = 10;
       // int index = binarySearchUsingIterative(array, key);
        int low=0;
        int high=array.length;
      int index=  binarySearchUsingRecursion(array,low,high,key);

        if (index > 0) {
            System.out.println("index is:::" + index + ":value is in the array::" + array[index]);
        } else {
            System.out.println("index is:::" + index);

        }
    }

    public static int binarySearchUsingIterative(int array[], int searchKey) {
        //searchKey>mid
        //searchKey<mid

        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (searchKey > array[mid]) {
                low = mid + 1;
            } else if (searchKey < array[mid]) {
                high = mid - 1;
            } else {
                return mid;

            }
        }
        return -1;
    }

    public static int binarySearchUsingRecursion(int array[], int low, int high, int key) {
        if (low == high) {
            if (array[low] == key)
                return low;
            else
                return 0;
        } else {
            int mid = (low + high) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key > array[mid]) {
               return binarySearchUsingRecursion(array, low,mid + 1,  key);

            } else {
               return  binarySearchUsingRecursion(array, mid - 1, high, key);

            }
        }
      //  return -1;
    }
}
