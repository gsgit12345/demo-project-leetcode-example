package com.example.backtrackingandrecursion;

public class PrintIncreasingAndDecreasing {
    public static void main(String str[]) {
        //printIncreasingDecreasing(122);
        System.out.println(factorial(5));
    }

    public static void printIncreasingDecreasing(int num) {
        //65-90
        //97-122
        if (num == 97) {
            return;
        }
        System.out.print((char) num);
        printIncreasingDecreasing(num - 1);
        //System.out.print((char)num);

    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;
        int fact = factorial(num - 1);
        return fact * num;
    }
}
