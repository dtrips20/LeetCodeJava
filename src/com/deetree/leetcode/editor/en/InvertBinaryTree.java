//Invert a binary tree.
//
// Example: 
//
// Input: 
//
// 
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9 
//
// Output: 
//
// 
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1 
//
// Trivia: 
//This problem was inspired by this original tweet by Max Howell: 
//
// Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off. 
// Related Topics Tree

package com.deetree.leetcode.editor.en;

import com.deetree.leetcode.editor.en.datastructure.TreeNode;

import java.util.*;

public class InvertBinaryTree {
    public static void main(String[] args) {
        Solution solution = new InvertBinaryTree().new Solution();
    }


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode invertTree(TreeNode root) {

            if ( root == null)
                return null;
            Queue<TreeNode> queue = new LinkedList<TreeNode>();

            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            return root;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}