package com.example.dsalevel1sumit.stack;

public class CustemStackDemo {
    public static void main(String str[])
    {
CustomeStack stack=new CustomeStack();

stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(35);
        stack.push(15);
        stack.push(16);
        stack.push(1);

        stack.push(12);
        stack.push(23);
        stack.display();
        System.out.println("size is in the stack::"+stack.size());
        System.out.println("pop is in the stack::"+stack.pop());
        System.out.println("top is in the stack::"+stack.top());


        // stack.push(2);



    }
}
