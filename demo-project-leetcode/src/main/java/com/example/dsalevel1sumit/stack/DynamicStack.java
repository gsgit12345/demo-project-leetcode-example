package com.example.dsalevel1sumit.stack;

public class DynamicStack {

    //https://www.youtube.com/watch?v=WuykwrJtZw8&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=140
    int size;
    int data[];
    public DynamicStack()
    {
        data=new  int[5];
        size=-1;
    }
    public int size()
    {
        return  size+1;
    }
    public void push(int value)
    {
        if(size==data.length-1)
        {
           int  temp[]=new int [2*data.length];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
            size++;
            data[size]=value;
        }else {
            data[size]=value;
            size++;
        }
    }
}
