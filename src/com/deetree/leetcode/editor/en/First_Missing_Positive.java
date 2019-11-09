/*
41. First Missing Positive
===========================
Hard

==============

Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
Note:

Your algorithm should run in O(n) time and uses constant extra space.
 */
package com.deetree.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class First_Missing_Positive {


    public static void main(String[] args) {
        First_Missing_Positive missing = new First_Missing_Positive();
        System.out.println(missing.firstMissingPositive(new int[]{10, 11, 12}));
    }

    public int firstMissingPositive(int[] nums) {


        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (i > 0)
                map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 1; i <= map.size(); i++) {
            if (!map.containsKey(i))
                return i;

            ans = i;
        }

        return ans + 1;

    }
}
