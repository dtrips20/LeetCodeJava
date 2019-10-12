package com.deetree;

public class ValidateBinarySearchTree {


    public static void main(String[] args) {


    }

    public static Boolean IsValidBST(TreeNode root) {

        return Helper(root, null, null);

    }

    private static Boolean Helper(TreeNode node, Integer min, Integer max) {
        if (node == null)
            return false;

        int val = node.val;

        if (min != null && val <= min) return false;
        if (max != null && val >= max) return false;

        if (!Helper(node.left, val, max)) return false;
        if (!Helper(node.right, min, val)) return false;

        return true;


    }

}
