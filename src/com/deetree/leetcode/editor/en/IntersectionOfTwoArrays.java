//Given two arrays, write a function to compute their intersection.
//
// Example 1: 
//
// 
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
// 
//
// 
// Example 2: 
//
// 
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4] 
// 
//
// Note: 
//
// 
// Each element in the result must be unique. 
// The result can be in any order. 
// 
//
// 
// Related Topics Hash Table Two Pointers Binary Search Sort

package com.deetree.leetcode.editor.en;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if (nums1.length < nums2.length)
                return intersection(nums2, nums1);

            Set<Integer> set = new HashSet<>();

            Set<Integer> setResult = new HashSet<>();

            for (int n : nums1) {
                set.add(n);
            }

            int count = 0;
            for (int n : nums2) {
                if (set.contains(n)) {
                    setResult.add(n);
                }
            }
            return setResult.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}