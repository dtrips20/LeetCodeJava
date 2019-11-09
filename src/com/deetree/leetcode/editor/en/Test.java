package com.deetree.leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
            } else if (i % 3 == 0) {
                sum = sum + i;
            } else if (i % 5 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
        //Test t = new Test();
        //int ans = t.solution(new int[]{1});
    }

    public int solution(int[] nums) {
        // write your code in Java SE 8

        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 1)
                continue;

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                return i;

            }

            ans = i;

        }


        return ans + 1;

    }

}
