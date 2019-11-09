/*

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.

 */
package com.deetree.leetcode.editor.en;

import com.deetree.leetcode.editor.en.datastructure.TreeNode;

public class DepthOfBinayTree {

    public static void main(String[] args) {


        TreeNode node = new TreeNode().GetPreCreatedTree();

        System.out.println(new DepthOfBinayTree().maxDepth(node));
    }

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

/*
===============================================================================
Complexity analysis
================================================================================
Time complexity : we visit each node exactly once, thus the time complexity is
O(N), where N is the number of nodes.

Space complexity : in the worst case,
the tree is completely unbalanced,
e.g. each node has only left child node,
the recursion call would occur O(N) times (the height O(N).
But in the best case (the tree is completely balanced),
the height of the tree would be log(N) Therefore, the space complexity in this case would be
O(Log(N)).
 */
}
