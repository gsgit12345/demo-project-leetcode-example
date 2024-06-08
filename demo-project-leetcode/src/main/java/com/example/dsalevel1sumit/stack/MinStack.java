package com.example.dsalevel1sumit.stack;

import java.util.Stack;

public class MinStack {
   // https://www.youtube.com/watch?v=4bjCEJmiPZA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=142

    Stack<Integer> allData;
    Stack<Integer> minData;
    public MinStack()
    {
        allData=new Stack<>();
        minData=new Stack<>();
    }
    public void push(int value)
    {
        allData.push(value);
        int currentValue=minData.isEmpty()?value:minData.peek();
        minData.push(currentValue>value?value:currentValue);
    }
    public int popAdd()
    {
//adding elemnt
        return 0;
    }
    public int topGet()
    {
        //getting element
        return 0;

    }
    public int popRemove()
    {
        //getting element
        return 0;

    }
    public int getMin()
    {
        return 0;

    }
}
