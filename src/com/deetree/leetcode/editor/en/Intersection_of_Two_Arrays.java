package com.deetree.leetcode.editor.en;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {

    public static void main(String[] args) {

        Intersection_of_Two_Arrays sec = new Intersection_of_Two_Arrays();

        int[] result = sec.intersection_old(new int[]{1}, new int[]{1});


    }

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) {
            set1.add(n);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) {
            set2.add(n);
        }


        if (set1.size() < set2.size()) {
            return set_intersection(set1, set2);
        } else {
            return set_intersection(set2, set1);
        }

    }

    private int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] idx = new int[set1.size()];
        int j = 0;
        for (Integer i : set1) {
            if (set2.contains(i)) {
                idx[j++] = i;
            }
        }

        return Arrays.copyOf(idx, j);

    }

    //This solution works but its not good.
    /*
        60 / 60 test cases passed.
        Status: Accepted
        Runtime: 41 ms
        Memory Usage: 37.4 MB

     */
    public int[] intersection_old(int[] nums1, int[] nums2) {

        int i = nums1.length - 1;
        int j = nums2.length - 1;
        HashSet<Integer> list = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        //int[] u = new int[Math.min(i+1,j+1)];

        if (i > j) {
            while (i >= 0) {
                list.add(nums1[i--]);
            }

            for (int a = 0; a <= j; a++) {
                if (list.contains(nums2[a]))
                    if (!result.contains(nums2[a]))
                        result.add(nums2[a]);
            }
        } else {
            while (j >= 0) {
                list.add(nums2[j--]);
            }

            for (int a = 0; a <= i; a++) {
                if (list.contains(nums1[a]))
                    if (!result.contains(nums1[a]))
                        result.add(nums1[a]);
            }
        }


        return result.stream().mapToInt(ii -> ii).toArray();
    }
}

