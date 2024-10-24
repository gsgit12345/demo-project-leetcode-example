package com.example.leetcode.backtracking.stack;

import java.util.HashSet;
import java.util.Stack;

public class RemoveInvalidParanthesisLeetCode_301 {
    public static void main(String str[]) {
String charStr="())";
int minCharaRemoval=isValid(charStr);

    }

    public String removeInvalidParanthesis(String str, int mincharRemoval, HashSet<String> hashSet) {
        return "";

    }

    public static  int isValid(String str) {
//1-if  braces  is  opening then  it will  push  in the stack
// 2-else braces  is  closing then  it has three condition
//i-if stack size is ==0 then also push in the stack
// II--else if stack contains the ) then alos push
//III-else if stack.peek() is ( then pop.
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                characterStack.push(ch);
            } else {
                if (ch == ')') {
                    characterStack.push(ch);
                } else if (characterStack.size() == 0) {
                    characterStack.push(ch);
                } else if (ch == ')') {
                    characterStack.push(ch);
                } else if (ch == '(') {
                    characterStack.pop();
                }
            }
        }
        return  characterStack.size();
    }
}
