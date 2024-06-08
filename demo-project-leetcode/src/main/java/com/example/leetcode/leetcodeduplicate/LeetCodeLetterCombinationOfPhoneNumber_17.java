package com.example.leetcode.leetcodeduplicate;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeLetterCombinationOfPhoneNumber_17 {
    public static void main(String str[]) {
        //String  s="";
        // possibleWords(s,"");
        String digits = "23";
        //result:--Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        String digits2 = "2";
       // Output: ["a","b","c"]
        String digits3 = "";



        List<String>  result= letterCombination(digits3);
      System.out.println(result.toString());
    }

    public List<String> letterCombinations_17(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        ans.add("");
        final String[] digitToLetters = {"", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (final char d : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (final String s : ans)
                for (final char c : digitToLetters[d - '0'].toCharArray())
                    temp.add(s + c);
            ans = temp;
        }

        return ans;
    }

    public static void possibleWordsNotTested(String s, String ans) {
        String keyPad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        String key = keyPad[(s.charAt(0) - '0')];

        for (int i = 0; i < key.length(); i++) {
            possibleWordsNotTested(s.substring(1), ans + key.charAt(i));
        }


    }

    public static List<String> letterCombination(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        return getLetterCombination(digits, 0);
    }

    public static List<String> getLetterCombination(String digit, int idx) {
        final String[] digitToLetters = {"", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (idx == digit.length()) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;

        }
        List<String> myResult = new ArrayList<>();
        String firstPosition = digitToLetters[digit.charAt(idx) - '0'];
        List<String> returnResult = getLetterCombination(digit, idx + 1);
        for (String rresult : returnResult) {
            for (int i = 0; i < firstPosition.length(); i++) {
                char ch = firstPosition.charAt(i);
                myResult.add(ch + rresult);
            }
        }


        return myResult;
    }
}
