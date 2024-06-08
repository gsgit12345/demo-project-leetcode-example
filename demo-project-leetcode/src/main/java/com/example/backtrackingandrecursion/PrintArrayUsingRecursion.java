package com.example.backtrackingandrecursion;

public class PrintArrayUsingRecursion {
    public  static void main(String str[])
    {
        int array[]={1,2,3,4,5,6};

        printArray(array,0);
    }
    public static void printArray(int array[],int index)
    {
        if(index==array.length)
            return;
        System.out.println(array[index]);
        printArray(array,index+1);
    }
}
