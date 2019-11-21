 //Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times. 
//
// You may assume that the array is non-empty and the majority element always exist in the array. 
//
// Example 1: 
//
// 
//Input: [3,2,3]
//Output: 3 
//
// Example 2: 
//
// 
//Input: [2,2,1,1,1,2,2]
//Output: 2
// 
// Related Topics Array Divide and Conquer Bit Manipulation
  
 package com.deetree.leetcode.editor.en;
 import java.util.*;
 public class MajorityElement{
     public static void main(String[] args) {
          Solution solution = new MajorityElement().new Solution();

          solution.majorityElement(new int[] {3,2,3});


     }
     

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if (  entry.getValue() > nums.length / 2)
                return entry.getKey();
        }

        return  -1;
    }


    public int majorityElement(int[] nums, boolean fast) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

 }