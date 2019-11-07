/*
75. Sort Colors
==================

Medium

Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same
color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Follow up:

A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's,
then 1's and followed by 2's.
Could you come up with a one-pass algorithm using only constant space?
 */
package com.deetree;

public class Sort_Colors {

    public static void main(String[] args) {
        Sort_Colors color = new Sort_Colors();
        color.sortColors(new int[]{2, 1, 0, 2, 2});
    }

    public void sortColors(int[] nums) {


        int curr = 0, low = 0;

        int high = nums.length - 1;

        int temp;
        while (low <= high) {

            if (nums[low] == 0) {

                //I dont know what is there in nums[curr] so store that value in temp.
                //but, i do know that nums[low] is 0
                //so lets pull that 0 to as left as possible in array.
                //and for next iteration set the left position +1 .
                //and whatever value nums[curr] was having set it to nums[low]
                //so in next iteration either nums[low] will be 0 or it will be <> 0;
                temp = nums[curr];
                nums[curr] = nums[low];
                nums[low] = temp;
                low++;
                curr++;
            } else if (nums[low] == 2) {
                //I dont know what is there in nums[high] so store that value in temp.
                //but, i do know that nums[low] is 2
                //so lets pull that 0 to as right as possible in array.
                //and for next iteration set the right position -1 .
                //and whatever value nums[curr] was having set it to nums[low]
                //so in next iteration either nums[low] will be 0 or it will be <> 0;
                temp = nums[high];
                nums[high] = nums[low];
                nums[low] = temp;
                high--;
            } else
                low++;


        }
    }
}
