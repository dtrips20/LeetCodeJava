/*
136. Single Number
===================
Easy
==================
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4

 */
package com.deetree;

import java.util.*;

public class Single_Number {

    public static void main(String[] args) {
        Single_Number s = new Single_Number();
        System.out.println(s.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    //XOR solution
    /*
    16 / 16 test cases passed.
    Status: Accepted
    Runtime: 0 ms
    Memory Usage: 38.9 MB
     */
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int n : nums) sum = sum ^ n;

        return sum;

    }

    //Using HashMap
    /*
    16 / 16 test cases passed.
    Status: Accepted
    Runtime: 11 ms
    Memory Usage: 40.4 MB

    You might have noticed that memory usage is almost same but the runtime has decreased.
    because search,insert,delete operation in hash table takes O(1).
     */
    public int singleNumber_sol_2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return -1;
    }

    //This solution was accepted but is not a good solution.
    //Time complexity is O(n^2) because we loop through the array and then
    //search the list O(n) then search the list for o(n) times for each element that mean O(nXn);
    /*
    16 / 16 test cases passed.
    Status: Accepted
    Runtime: 560 ms
    Memory Usage: 39.3 MB

    Time Complexity : O(n)
    Space Complexity : O(1)
     */
    public int singleNumber_sol_1(int[] nums) {

        int result = 0;

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            Object o = (int) nums[i];
            if (list.contains(o))
                list.remove(o);
            else
                list.add(nums[i]);

        }

        if (list.size() == 1)
            return list.get(0);
        else
            return -1;

    }


}
