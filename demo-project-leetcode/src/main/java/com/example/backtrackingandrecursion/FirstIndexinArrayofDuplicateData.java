package com.example.backtrackingandrecursion;

public class FirstIndexinArrayofDuplicateData {
    //https://www.youtube.com/watch?v=TU0xUG9eO3Y&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=20
    // https://www.geeksforgeeks.org/find-index-of-first-occurrence-when-an-unsorted-array-is-sorted/

    public static void main(String str[]) {
        int array[] = {2, 3, 4, 5, 5, 6, 7};
       int num= firstIndexOfDuplicateNumberInArray(array,0,5);
       System.out.println(num);
    }

    public static int firstIndexOfDuplicateNumberInArray(int array[], int index, int num) {
        if (index == array.length)
            return -1;
        int idx = firstIndexOfDuplicateNumberInArray(array, index + 1, num);
        if (num == array[index]) {
            return index;
        } else {
            return idx;
        }

    }
}
