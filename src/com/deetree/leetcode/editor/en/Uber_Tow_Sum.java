package com.deetree.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class Uber_Tow_Sum {


    public static void main(String[] str) {
        Uber_Tow_Sum t = new Uber_Tow_Sum();
        int[] result = t.twoSum(new int[]{3, 3}, 6);

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }

        }

        return result;
    }
}
