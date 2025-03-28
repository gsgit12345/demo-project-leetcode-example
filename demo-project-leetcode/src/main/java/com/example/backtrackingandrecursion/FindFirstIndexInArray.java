package com.example.backtrackingandrecursion;

public class FindFirstIndexInArray {
    public static void main(String str[]) {
        int array[] = {3, 4, 5, 3, 2, 5, 8, 3, 9, 4, 10, 1, 1, 2};
        int num = 1;
        int idx = 0;
        int index = findFirstIndex(array, idx, num);
        System.out.println("found index is::" + index);

       int index2=  firstIndexUsingIterativeWay(array,idx,num);
        System.out.println("found index2 is::" + index2);

    }

    public static int findFirstIndex(int array[], int idx, int num) {
return 0;
    }

    public static int firstIndexUsingIterativeWay(int array[], int idx, int num) {
return 0;
    }
    public static int firstIndexUsingBinary(int array[], int idx, int num) {
        return 0;
    }

    }
