package com.example.leetcode.numeric;

public class RomanToInteger {
    public static void main(String str[])
    {
//https://www.youtube.com/watch?v=jA6S2hhjU0Y
        //https://www.youtube.com/watch?v=pUV_4YeJzjM
        //https://programs.programmingoneonone.com/2021/08/leetcode-roman-to-integer-problem-solution.html
    }
    public static int romanToInt(String roman)
    {

        return 0;
    }
    public int getIntValue(String num)
    {
        switch(num)
        {
            case  "I":
            return 1;
            case  "IV":
                return 4;
            case  "V":
                return 5;
            case  "IX":
                return 9;
            case  "X":
                return 10;
            case  "D":
                return 50;
            default : return 0;
        }
    }
}
