/*
23. Merge k Sorted Lists
=========================

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]

Output: 1->1->2->3->4->4->5->6


*/
package com.deetree.leetcode.editor.en;

import java.util.*;

public class Merge_k_Sorted_Lists {

    public static void main(String[] args) {


    }

    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> cmp = new Comparator<ListNode>() {

            @Override
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;
            }
        };

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(cmp);
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        ListNode node = new ListNode(0);
        ListNode dummy = node;

        while (!queue.isEmpty()) {
            node.next = queue.poll();
            node = node.next;

            ListNode next = node.next;

            if (next != null) {
                queue.add(next);
            }
        }

        return dummy.next;


    }

}
