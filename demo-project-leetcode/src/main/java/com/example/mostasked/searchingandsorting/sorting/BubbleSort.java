package com.example.mostasked.searchingandsorting.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String str[])
    {
        int arr[]={3,12,6,78,23,0};

       int result[]= bubbleSort(arr);
       System.out.println(Arrays.toString(result));

    }
    public static int[] bubbleSort(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {
           for(int j=0;j<array.length-i-1;j++)
           {
               if(array[j]>array[j+1])
               {
                   swap(array,j+1,j);
               }
           }
        }
        return array;
    }

    public static int[] swap(int array[],int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
