package com.deetree.leetcode.editor.en;

import com.deetree.leetcode.editor.en.datastructure.TreeNode;

public class LeftSideViewOfTree {

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(100);
        rootNode.left = new TreeNode(90);
        rootNode.right = new TreeNode(110);
        rootNode.left.left = new TreeNode(85);
        rootNode.left.right = new TreeNode(91);
        rootNode.right.left = new TreeNode(109);
        rootNode.right.right = new TreeNode(111);
        rootNode.right.right.right = new TreeNode(114);


        LeftSideViewOfTree view = new LeftSideViewOfTree();
        view.ViewLeftSide(rootNode, 1);

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

    int MAX_LEVEL = 0;

    public void ViewLeftSide(TreeNode node, int level) {
        if (node == null)
            return;

        if (MAX_LEVEL < level) {
            System.out.println(node.val);
            MAX_LEVEL = level;
        }

        ViewLeftSide(node.left, level + 1);
        ViewLeftSide(node.right, level + 1);
    }
}
