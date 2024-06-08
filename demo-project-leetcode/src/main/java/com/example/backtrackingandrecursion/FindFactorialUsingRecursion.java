package com.example.backtrackingandrecursion;

public class FindFactorialUsingRecursion {
    public static void main(String str[])
    {
        int num=5;
       // 5*4*3*2*1;
      int fact=  factorialUsingRecursion(num)  ;
      System.out.println(fact);
    }
    public static int factorialUsingRecursion(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fact=factorialUsingRecursion(n-1) ;//it will run for n-1
        int factorial=n*fact; //it will run for (n)
        return factorial;
    }

}
