package com.example.dsalevel1sumit.tree;

public class GenericTreeDemo {
    /**
     * /* Let us create below tree
     * *             10
     * *     / / \ \
     * *     2 34 56 100
     * *     / \         | / | \
     * *     77 88     1 7 8 9
     */


    public static void main(String str[]) {
        int array[] = {10, 77, -1, 2, 88, -1, 34, -1, 56, -1, 1, -1, 7, -1, 8, -1, 9, -1, 100, -1, -1};
        GenericTree tree = new GenericTree();

        for (int data : array) {
           // tree.addNode(data);

        }

    }
}
