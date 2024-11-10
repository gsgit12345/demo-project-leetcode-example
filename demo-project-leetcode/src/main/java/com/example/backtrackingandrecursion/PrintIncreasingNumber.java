package com.example.backtrackingandrecursion;

public class PrintIncreasingNumber {
    public static void main(String str[])
    {
        printIncreasing(5);
    }
    public static void printIncreasing(int num)
    {
        if(num==0)
            return ;
        printIncreasing(num-1);
        System.out.println(num);
    }
}
