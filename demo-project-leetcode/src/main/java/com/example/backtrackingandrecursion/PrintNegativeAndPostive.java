package com.example.backtrackingandrecursion;

public class PrintNegativeAndPostive {
    public static void main(String str[])
    {
        printIncreasingDecresingOfSameNum(5)   ;
    }
    public static void printIncreasingDecresingOfSameNum(int num)
    {
        if(num==-5)
        {
            System.out.println(num);
            return ;
        }
        System.out.println(num);
        printIncreasingDecresingOfSameNum(num-1);
    }
}
