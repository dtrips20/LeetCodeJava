/*
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
package com.deetree.amazon.medium;

import java.util.*;

public class Top_K_Frequent_Elements {


    public static void main(String[] args) {
        Top_K_Frequent_Elements k = new Top_K_Frequent_Elements();
        List<Integer> results = k.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> result = new LinkedList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for (int i : map.keySet()) {
            heap.add(i);

            if (heap.size() > k) {
                heap.poll();
            }

        }

        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
