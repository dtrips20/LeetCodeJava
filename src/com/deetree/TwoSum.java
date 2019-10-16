package com.deetree;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
===============================================
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        TwoSum s = new TwoSum();
        //int[] result  = s.TwoSum_Brute_Force(new int[]{3,3},6);
        int[] result = s.twoSum(new int[]{3, 3}, 6);

        for (int i : result) {
            System.out.println(i);
        }

    }

    //using hashmap

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return (new int[]{i, map.get(target - nums[i])});
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    //Brute force solution
    public int[] TwoSum_Brute_Force(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }
}
