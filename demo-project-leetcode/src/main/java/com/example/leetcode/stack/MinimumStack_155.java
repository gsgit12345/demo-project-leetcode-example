package com.example.leetcode.stack;

import java.util.Stack;

public class MinimumStack_155 {

    public Stack<Integer> allData;
    public Stack<Integer> minData;

    public MinimumStack_155() {
        allData = new Stack<>();
        minData = new Stack<>();
    }

    public int size() {
        return allData.size();
    }

    public void push(int value) {
        allData.push(value);
        int currValue = minData.isEmpty() ? value : minData.peek();
        minData.push(currValue > value ? value : currValue);

    }

    public void pop() {
        allData.pop();
        minData.pop();

    }

    public int top() {
        return allData.peek();

    }

    public int getMin() {
        return minData.peek();
    }

}