package com.example.backtrackingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class GetKeyPadIOrLetterCombinationnMobile {
    public static void main(String str[]) {

        String st = "56";
        ArrayList<String> result = getKeyPadCombination(st);

        System.out.println("result is::" + result);
    }

    public static ArrayList<String> getKeyPadCombination(String keyCode) {

        String array[] = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

        if (keyCode.length() == 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }
        //56
        char firstLetter = keyCode.charAt(0);//5

        String otherLetter = keyCode.substring(1); //6

        ArrayList<String> result = getKeyPadCombination(otherLetter);//call for other letter

        ArrayList<String> myresult = new ArrayList<>();
        String codeForch = array[firstLetter - '0'];
        for (int i = 0; i < codeForch.length(); i++) {
            char ch = codeForch.charAt(i);
            for (String rs : result) {
                myresult.add(ch + rs);
            }
        }
        return myresult;
    }
}
