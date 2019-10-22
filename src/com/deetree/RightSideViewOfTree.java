/*
Given a binary tree, imagine yourself standing on the right side of it,
return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
 */
package com.deetree;

import java.util.ArrayList;
import java.util.List;

public class RightSideViewOfTree {

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(100);
        rootNode.left = new TreeNode(90);
        rootNode.right = new TreeNode(110);
        rootNode.left.left = new TreeNode(85);
        rootNode.left.right = new TreeNode(91);
        rootNode.right.left = new TreeNode(109);
        rootNode.right.right = new TreeNode(111);
        rootNode.right.right.right = new TreeNode(114);


        RightSideViewOfTree view = new RightSideViewOfTree();
        List<Integer> result = view.rightSideView(rootNode);

        for (int n : result) {
            System.out.println(n);
        }
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

    int MAX_LEVEL = -1;
    List<Integer> values = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {


        return helper(root, 0);
    }

    public List<Integer> helper(TreeNode root, int level) {
        if (root == null)
            return values;

        if (MAX_LEVEL < level) {
            values.add(root.val);

            MAX_LEVEL = level;
        }


        helper(root.right, level + 1);
        helper(root.left, level + 1);

        return values;
    }

}
