package com.example.leetcode.stack;

public class LeetCodeGetMinimumValueInStack_155 {
    public static void main(String str[])
    {
        //https://yellowcoding.com/leetcode-155-min-stack/
       // https://www.youtube.com/watch?v=dmFfPsdORBA&list=PLUg9hRlm7gxRgJgBhgp5uc05HFO0VIjdR&index=6
        MinimumStack_155  mystack=new MinimumStack_155();
        mystack.push(-2);
        mystack.push(0);
        mystack.push(-3);
        mystack.getMin(); // return -3
        mystack.pop();
        mystack.top();    // return 0
        mystack.getMin(); // return -2
    }
}
