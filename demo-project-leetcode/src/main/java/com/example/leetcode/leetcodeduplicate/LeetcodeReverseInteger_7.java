package com.example.leetcode.leetcodeduplicate;

public class LeetcodeReverseInteger_7 {
    public static void main(String str[]) {
        int num = -92399999;

        int reverse = reverseInteger(num);
        System.out.println("reverse num is::" + reverse);

    }

    public static int reverseInteger(int num) {
        //https://www.youtube.com/watch?v=paG0uP18IAg
        boolean isNegative = false;
        if (num < 0) {
            num = -num;
            isNegative = true;
        }
        long ans = 0;  //for integer overflow case
        while (num != 0) {
            int mode = num % 10;
            ans = ans * 10 + mode;
            num = num / 10;
        }
        if (isNegative) {
            ans = -ans;
        }

        if(ans<Integer.MIN_VALUE||ans>Integer.MAX_VALUE)
        {
            ans=0;
        }
        return (int)ans;
    }
}
