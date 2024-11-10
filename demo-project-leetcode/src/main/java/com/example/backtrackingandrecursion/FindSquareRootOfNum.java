package com.example.backtrackingandrecursion;

public class FindSquareRootOfNum {
    public static void main(String str[])
    {
        int num=2;
        int squareRoot=squareRootUsingIterative(num,4);
        System.out.println(squareRoot);
    }
    public static int squareRootOfNum(int num,int power)
    {
        if(power==0)
        {
            return 1;
        }
        int square1=squareRootOfNum(num,power-1);
        int root=num*square1;
      //
         return root;
    }
public static int squareRootUsingIterative(int n,int square)
{
    int root=1;
    for(int i=1;i<=square;++i)
    {
     root*=n;
    }
    return root;
}
}
