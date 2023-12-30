package com.example.leetcode.numeric;

public class IntegerToRomanLeetCode {
    public static void main(String str[]) {
        //M=1000
        //D=500
        //C=100
        //L=50
        //X=10
        //V=5
        //I=1
//https://www.youtube.com/watch?v=yzB4M-UXqgI
      //  https://www.youtube.com/watch?v=f_F9ItFyiEg
        //time and space:-Big(1),big(1)
        //https://walkccc.me/LeetCode/problems/0012/#__tabbed_2_2
        int num = 1994;
        //Output: "MCMXCIV"
        String roman = intToRoman(num);
        System.out.println(roman);

    }

    public static String intToRoman(int num) {
        final int Decimal[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        if (num == 0)
            return " ";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < Decimal.length; i++) {
            if (num == 0) {
                break;
            }
            while (num >= Decimal[i]) {
                num = num - Decimal[i];
                stringBuffer.append(roman[i]);
            }
        }
        return stringBuffer.toString();
    }
}
