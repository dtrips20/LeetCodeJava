package com.deetree;

//Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode() {

    }

    public TreeNode GetPreCreatedTree() {
        TreeNode rootNode = new TreeNode(100);
        rootNode.left = new TreeNode(90);
        rootNode.right = new TreeNode(110);
        rootNode.left.left = new TreeNode(85);
        rootNode.left.right = new TreeNode(91);
        rootNode.right.left = new TreeNode(109);
        rootNode.right.right = new TreeNode(111);
        rootNode.right.right.right = new TreeNode(114);

        return rootNode;
    }
}
