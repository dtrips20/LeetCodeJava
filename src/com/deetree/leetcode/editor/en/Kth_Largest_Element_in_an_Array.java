/*
215. Kth Largest Element in an Array
====================================
Medium
========

Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
==========================
Input: [3,2,1,5,6,4] and k = 2
Output: 5


Example 2:
==========================
Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4

Note:
==========================
You may assume k is always valid, 1 ≤ k ≤ array's length.

 */
package com.deetree.leetcode.editor.en;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

    public static void main(String[] args) {
        Kth_Largest_Element_in_an_Array k = new Kth_Largest_Element_in_an_Array();
        System.out.println(k.findKthLargest(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));


    }

    public int findKthLargest(int[] nums, int k) {

        if (nums.length == 0)
            return 0;

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int i : nums) {
            queue.add(i);

            if (queue.size() > k)
                queue.poll();
        }

        int size = queue.size();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = queue.poll();
        }

        return arr[0];
    }
}
