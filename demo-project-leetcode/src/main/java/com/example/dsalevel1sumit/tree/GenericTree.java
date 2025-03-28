package com.example.dsalevel1sumit.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public  class GenericTree {
    int data;
    List<GenericTree> children = new ArrayList<>();

    public GenericTree addNode(int data1) {
        GenericTree root = null;
        Stack<GenericTree> stack = new Stack<>();
        System.out.println(data1);
        if (data1 == -1) {
            stack.pop();
        } else {
            GenericTree node = new GenericTree();
            node.data = data1;
            if (stack.size() > 0) {
                stack.peek().children.add(node);
                //stack.push(node);
            } else {
                root = node;
            }
            stack.push(node);

        }
    //    System.out.println(root.toString());
return  root;
    }
}
