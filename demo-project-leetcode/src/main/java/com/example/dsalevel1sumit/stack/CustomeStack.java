package com.example.dsalevel1sumit.stack;

public class CustomeStack {
    //https://www.youtube.com/watch?v=vp9BhLtT7CY&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=139
    int size;
    int data[];

    public CustomeStack() {
        data = new int[10];
        size = -1;
    }

    public int size() {
        return size+1;
    }

    public void display() {
        for (int i = size; i >0; i--) {
            System.out.println("element in statck  [" + data[i] + "]");
        }
    }

    public void push(int value) {
        if (size == data.length - 1) {
            System.out.println("stack is overflow");
        } else {
            size++;
            data[size] = value;
        }

    }

    public int pop() {
        if (size == -1) {
            System.out.println("stack is underflow");
            return -1;

        } else {

            int element = data[size];
            size--;

            return element;

        }
    }

    public int top() {
        if (size == -1) {
            System.out.println("stack is underflow");
            return -1;
        } else {
            return data[size];
        }
    }
}
