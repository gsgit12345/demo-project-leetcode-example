package com.example.leetcode.numeric;

public class Leetcodeadddigit_258 {
    public static void main(String str[])
    {
        int num=12;
      int result=  addTwoNum(num);
      System.out.println(result);
    }
    public static int addTwoNum(int num)
    {
        if(num==0)
            return 0;
        int result =(num%9==0)?9:num%9;

        return result;
    }
}
