package com.deetree;

import com.deetree.datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBinaryTree {

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(100);
        rootNode.left = new TreeNode(90);
        rootNode.right = new TreeNode(110);
        rootNode.left.left = new TreeNode(85);
        rootNode.left.right = new TreeNode(91);
        rootNode.right.left = new TreeNode(109);
        rootNode.right.right = new TreeNode(111);
        rootNode.right.right.right = new TreeNode(114);


        MaximumWidthofBinaryTree count = new MaximumWidthofBinaryTree();
        count.widthOfBinaryTree(rootNode);

        /*
                        100
                      /    \
                     /      \
                    90      110
                    / \     / \
                   /   \   /   \
                  85  91  109   111
                                 \
                                  \
                                  114
         */
    }


    public int widthOfBinaryTree(TreeNode root) {

        //int NodesSoFar = 0 ;
        int currentLevelNodes = 0;
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {


            int size = queue.size();

            for (int i = 0; i <= size - 1; i++) {

                TreeNode currentNode = queue.poll();
                currentLevelNodes += 2;
                if (currentNode.right != null)
                    queue.add(currentNode.right);


                if (currentNode.left != null)
                    queue.add(currentNode.left);


            }


        }
        return currentLevelNodes;
    }
}
