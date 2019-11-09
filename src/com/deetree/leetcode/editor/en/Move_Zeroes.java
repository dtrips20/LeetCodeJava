/*
283. Move Zeroes
=================
Easy

Given an array nums, write a function to move all 0's to the
end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

 */

package com.deetree.leetcode.editor.en;

public class Move_Zeroes {

    public static void main(String[] args) {

        Move_Zeroes zero = new Move_Zeroes();
        int[] nums = {0, 0, 1};
        zero.moveZeroes(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public void moveZeroes(int[] nums) {

        int count = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }

        }

        while (count <= nums.length - 1) {
            nums[count++] = 0;
        }


    }
}

