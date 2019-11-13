//Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
//
// The binary search tree is guaranteed to have unique values. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//Output: 32
// 
//
// 
// Example 2: 
//
// 
//Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//Output: 23
// 
//
// 
//
// Note: 
//
// 
// The number of nodes in the tree is at most 10000. 
// The final answer is guaranteed to be less than 2^31. 
// 
// 
// Related Topics Tree Recursion

package com.deetree.leetcode.editor.en;

import com.deetree.leetcode.editor.en.datastructure.TreeNode;

public class RangeSumOfBst {
    public static void main(String[] args) {
        Solution solution = new RangeSumOfBst().new Solution();
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
        int ans = 0;

        public int rangeSumBST(TreeNode root, int L, int R) {
            DFS(root, L, R);
            return ans;
        }

        public void DFS(TreeNode node, int L, int R) {
            if (node != null) {
                if (node.val >= L && node.val <= R) {
                    ans += node.val;
                }
                if (node.val > L)
                    DFS(node.left, L, R);
                if (node.val < R)
                    DFS(node.right, L, R);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}