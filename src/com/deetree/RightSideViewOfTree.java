package com.deetree;

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
        view.ViewRightSide(rootNode, 1);

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

    public void ViewRightSide(TreeNode node, int level) {
        if (node == null)
            return;

        if (MAX_LEVEL < level) {
            System.out.println(node.val);
            MAX_LEVEL = level;
        }


        ViewRightSide(node.right, level + 1);
        ViewRightSide(node.left, level + 1);


    }
}
