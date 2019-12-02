/*
599. Minimum Index Sum of Two Lists
===================================
Easy
====

Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
=====================
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Example 2:
=========================
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).

Note:
=================
The length of both lists will be in the range of [1, 1000].
The length of strings in both lists will be in the range of [1, 30].
The index is starting from 0 to the list length minus 1.
No duplicates in both lists.

 */
package com.deetree.leetcode.editor.en;

import java.util.*;

public class Minimum_Index_Sum_of_Two_Lists_599 {

    public static void main(String[] args) {
        Minimum_Index_Sum_of_Two_Lists_599 min = new Minimum_Index_Sum_of_Two_Lists_599();
        String[] result = min.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"});
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list2.length > list1.length)
            return findRestaurant(list2, list1);

        List<String> result = new ArrayList<>();
        int index = list1.length + list2.length + 1;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j]) && (i + j) <= index && !result.contains(list2[j])) {
                    result.add(list1[i]);
                    index = Math.min(index, i + j);
                }
            }
        }
        return result.toArray(new String[result.size()]);


    }
}
