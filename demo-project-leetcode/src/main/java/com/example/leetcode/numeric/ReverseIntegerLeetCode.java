package com.example.leetcode.numeric;

public class ReverseIntegerLeetCode {
    public  static void main(String str[])
    {
        int x = 123; //ans:-321
        int x1 = 120; //ans:-21
        int x2 = -123; //ans:-21
        int x3 = 32768; //ans:-21

        int result=  reverseInteger(x3);
      System.out.println("result is::"+result);

    }
    public static int reverseInteger(int num)
    {
        boolean isNegative=false;
        if(num<0)
        {
            isNegative=true;
        }
       num= Math.abs(num);
        int reverse=0;
        while(num!=0)
        {
            int mod=num%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10)
                return 0;
            reverse=reverse*10+mod;

            num=num/10;
        }
        return isNegative ? -reverse :reverse;
    }
}
