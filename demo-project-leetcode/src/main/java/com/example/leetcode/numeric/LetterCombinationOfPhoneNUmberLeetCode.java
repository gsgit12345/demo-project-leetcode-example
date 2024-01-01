package com.example.leetcode.numeric;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNUmberLeetCode {
    final static String[] digitToLetters = {"", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String str[]) {
        String digits = "28";
        // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

     //   List<String> result = letterCombinationOfPhoneNumber(digits);
        possibleStringUsingRecursion(digits,"");
      //  System.out.println(result.toString());
    }

    public static List<String> letterCombinationOfPhoneNumber(String digit) {

        if (digit.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        result.add("");

        char digitChar[] = digit.toCharArray();//convert the digit string in character like "23",'2','3'
        for (char eachDigit : digitChar) {
            List<String> temp = new ArrayList<>();
            for (final String s : result) {
                char stringAtDigitPosition[] = digitToLetters[eachDigit - '0'].toCharArray();
                for (char strChar : stringAtDigitPosition) {
                    temp.add(s + strChar);
                    result = temp;
                }
            }
        }

        return result;

    }

    public static void possibleStringUsingRecursion(String digit, String ans) {
        //  https://www.youtube.com/watch?v=1TGTBDWY1s4
        if (digit.length() == 0) {
            System.out.print(" "+ans);
            return;
        }

        String key = digitToLetters[digit.charAt(0) - '0'];
       String secondDigit= digit.substring(1);
        for (int i = 0; i < key.length(); i++) {
          char ch=  key.charAt(i);
            possibleStringUsingRecursion(secondDigit, ans+ch );
        }
    }
}
