package com.example.leetcode.numeric;

public class AtoiLeetCodeStringToInteger {
    //1-ignore white spaces before words and after words
    //2-Handle the overflow and underflow
    //3-Input is the string and output would be Integer
    //4-+ and - sign handling in the algo would be done.
    //5- we will consider only the  first words like "42 52".in this case we will hamdle only //"42".not we will consider "52".if first word is not valid integer.we will return 0.if in //////string first word can not form a valid integer .we will return 0

    public static void main(String str[])
    {
        String s = "42";//ans:-42;
        String s1 = "   -42";//ans:-42;
        String  s3 = "4193 with words";


        int result=  stringToIntegerConversion(s3);
      System.out.println("result is::"+result);
      //https://www.youtube.com/watch?v=FyTpsuWAoc8

    }
    public static int stringToIntegerConversion(String str)
    {
        if(str==null)
            return 0;
        char []strValue=str.toCharArray();
        int i=0;
        while(i<strValue.length && strValue[i]==' ')
            i++;
        if(i>=strValue.length)
            return 0;
        int sign=1;
        if(strValue[i]=='+' || strValue[i]=='-') {
            sign = strValue[i] == '+' ? 1 : -1;
            i++;
        }
        int num=0;
        for(;i<strValue.length && strValue[i]>='0' && strValue[i]<='9';i++)
        {
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && strValue[i]-'0'>Integer.MIN_VALUE%10))
                return  (sign==1) ?Integer.MAX_VALUE :Integer.MIN_VALUE;
          num=num*10+strValue[i]-'0';
        }
        return num*sign;
    }
}
