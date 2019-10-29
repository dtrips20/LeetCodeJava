/*
543. Diameter of Binary Tree
=================================

Given a binary tree, you need to compute the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5

Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.

 */
package com.deetree.easy;

import com.deetree.TreeNode;

public class Diameter_of_Binary_Tree {

    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        ans = 1;
        helper(root);

        return ans - 1;
    }


    public int helper(TreeNode root) {
        if (root == null)
            return 0;

        int l = helper(root.left);
        int r = helper(root.right);
        ans = Math.max(ans, l + r + 1);

        return Math.max(l, r) + 1;
    }


}
