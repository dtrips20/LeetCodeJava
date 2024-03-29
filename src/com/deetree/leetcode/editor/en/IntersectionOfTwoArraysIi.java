//Given two arrays, write a function to compute their intersection.
//
// Example 1: 
//
// 
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
// 
//
// 
// Example 2: 
//
// 
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9] 
// 
//
// Note: 
//
// 
// Each element in the result should appear as many times as it shows in both arrays. 
// The result can be in any order. 
// 
//
// Follow up: 
//
// 
// What if the given array is already sorted? How would you optimize your algorithm? 
// What if nums1's size is small compared to nums2's size? Which algorithm is better? 
// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once? 
// 
// Related Topics Hash Table Two Pointers Binary Search Sort

package com.deetree.leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysIi {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArraysIi().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {

            if (nums1.length < nums1.length) {
                return intersect(nums2, nums1);
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int n : nums1) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            int count = 0;
            for (int n : nums2) {
                int cnt = map.getOrDefault(n, 0);

                if (cnt > 0) {
                    nums1[count++] = n;
                    map.put(n, cnt - 1);
                }
            }

            return Arrays.copyOfRange(nums1, 0, count);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}