package com.deetree;

import com.deetree.datastructure.TreeNode;

public class ValidateBinarySearchTree {


    public static void main(String[] args) {


        TreeNode rootNode = new TreeNode(100);
        rootNode.left = new TreeNode(90);
        rootNode.right = new TreeNode(110);
        rootNode.left.left = new TreeNode(85);
        rootNode.left.right = new TreeNode(91);
        rootNode.right.left = new TreeNode(109);
        rootNode.right.right = new TreeNode(111);

        //ValidateBinarySearchTree validate = new ValidateBinarySearchTree();

        System.out.println(IsValidBST(rootNode));



    }


    public static Boolean IsValidBST(TreeNode root) {

        return Helper(root, null, null);

    }

    private static Boolean Helper(TreeNode node, Integer min, Integer max) {
        if (node == null)
            return true;

        int val = node.val;

        if (min != null && val <= min) return false;
        if (max != null && val >= max) return false;


        if (!Helper(node.left, min, val)) return false;
        if (!Helper(node.right, val, max)) return false;


        return true;



    }

}
