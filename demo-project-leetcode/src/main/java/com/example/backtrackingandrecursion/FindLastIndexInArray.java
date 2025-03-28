package com.example.backtrackingandrecursion;

public class FindLastIndexInArray {
    public static void main(String str[]) {
        //https://www.youtube.com/watch?v=xttMLI4Kb3k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=22
        int array[] = {3, 4, 5, 3, 2, 5, 8, 3, 9, 4, 10, 1, 1, 2};
        int num = 3;
        int idx = 0;
        int index = findTheLastIndexInArray(array, idx, num);
        System.out.println("found index is::" + index);

    }

    public static int findTheLastIndexInArray(int array[], int idx, int num) {
        return 0;
    }
}
