package com.example.backtrackingandrecursion;

public class PrintDecreasingUsingRecursion {
    public static void main(String str[])
    {
        int num=5;
        //printDecreasing(num);
        //printIncreasing(num);
        printIncreasingAndDecreasing(num);
    }
    public static void printDecreasing(int num)
    {

        if(num==0)
            return ;
        System.out.println(num);
        printDecreasing(num-1);
    }
    public static void printIncreasing(int num)
    {
        if(num==0)
        {
            return ;
        }
        printIncreasing(num-1);
        System.out.println(num);

    }

    public static void printIncreasingAndDecreasing(int num)
    {
        if(num==0)
        {
            return ;
        }
        System.out.println(num);

        printIncreasingAndDecreasing(num-1);
        System.out.println(num);

    }


}
