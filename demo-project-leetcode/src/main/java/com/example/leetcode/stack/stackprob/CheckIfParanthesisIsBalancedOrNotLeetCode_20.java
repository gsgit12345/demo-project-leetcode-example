package com.example.leetcode.stack.stackprob;

import java.util.Stack;

public class CheckIfParanthesisIsBalancedOrNotLeetCode_20 {

    public static void main(String str[]) {
        // Open brackets must be closed by the same type of brackets.
        //   Open brackets must be closed in the correct order.
        //Every close bracket has a corresponding open bracket of the same type.
//https://leetcode.com/problems/valid-parentheses/description/
        String input = "{[(())]";
        String input1 = "()[]{}";
        String input2 = "(]";
        String input3 = "([])";
        Stack<Character> characterStack = new Stack<>();
        //  isParanthesisBalancedLeet_20(characterStack, input1);
      //  boolean result = isParanthesisBalancedLeet_20(characterStack, input3);
       // System.out.println("result is::" + result);
        boolean result2=  handleCharacterWithoutStack(input3);
        System.out.println("result2 is::" + result2);

    }

    //https://prepfortech.io/leetcode-solutions/valid-parentheses
    public static boolean isParanthesisBalancedLeet_20(Stack<Character> stack, String input) {

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            //for initially push the opening bracktes in the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                //check if stack is empty .return false;
                if (stack.isEmpty()) {
                    return false;
                }
                //get the top element in stack
                char topElement = stack.pop();
                //chek that there is opening character in the input string and check the top elemnt in stack is closing bracket
                if (ch == ')' && topElement != '(' || ch == '}' && topElement != '{' || ch == ']' && topElement != '[') {
                    return false;
                }
              /*
                else if (ch == '}' && topElement != '{') {
                    return false;
                } else if (ch == ']' && topElement != '[') {
                    return false;
                }
                */

            }
        }
        //if stack is emty it will return the true or other wise there is extra opening or closing in the stack
        return stack.isEmpty();
    }

    public static boolean handleCharacterWithoutStack(String ch) {
        char[] charArray = ch.toCharArray();
        char stack[] = new char[charArray.length];
        int i = -1;
        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[')
                stack[++i] = c;
             else {
                if (i >= 0 && ((stack[i] == '(' && c == ')') || (stack[i] == '{' && c == '}') || (stack[i] == '[' && c == ']')))
                    i--;
                    else
                        return false;

            }
        }
        return i == -1;
    }
}
