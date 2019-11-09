package com.deetree.leetcode.editor.en;

import com.deetree.leetcode.editor.en.datastructure.TreeNode;

import java.util.HashMap;
import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {

    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        TreeNode node = new TreeNode().GetPreCreatedTree();

        Vertical_Order_Traversal_of_a_Binary_Tree travel = new Vertical_Order_Traversal_of_a_Binary_Tree();
        travel.DFS(node, 0);

        for (Map.Entry<Integer, Integer> entry : travel.map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

    }

    public void DFS(TreeNode node, int x) {


        if (node != null) {
            map.put(x, map.getOrDefault(x, 0) + node.val);
            DFS(node.left, x - 1);
            DFS(node.right, x + 1);
        }


    }
}
