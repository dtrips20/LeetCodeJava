package com.deetree.leetcode.editor.en;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.

Example:
====================================
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:
If you have figured out the O(n) solution,
try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

    public static void main(String[] args) {

        MaximumSubarray sub = new MaximumSubarray();
        // System.out.println(sub.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //System.out.println(sub.Helper(nums, 0, nums.length - 1));
        System.out.println(sub.maxSubArray_Dynamic_Programming(nums));



    }

    /*
    Solve using Dynamic programming
    Time Complexity : O(N)
    Space Complexity: O(1)
     */

    public int maxSubArray_Dynamic_Programming(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0)
                nums[i] = nums[i] + nums[i - 1];

            max = Math.max(max, nums[i]);
        }
        return max;
    }
    /*
     O(n log(n)) solution
     */
    private int maxSubArray(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int result = 0;
        int maxSoFar = Integer.MIN_VALUE;
        int currMax = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            currMax += nums[i];
            maxSoFar = Math.max(maxSoFar, currMax);
            if (currMax < 0)
                currMax = 0;
        }
        return maxSoFar;
    }

    /*
    Divide and conquer solution.
     */

    public int Helper(int[] nums, int left, int right) {
        if (left == right)
            return nums[left];

        int mid = (left + right) / 2;
        int leftSum = Helper(nums, left, mid);
        int rightSum = Helper(nums, mid + 1, right);
        int crossum = crosssum(nums, left, right, mid);

        return Math.max(Math.max(leftSum, rightSum), crossum);
    }


    public int crosssum(int[] nums, int left, int right, int p) {
        if (left == right)
            return nums[left];

        int curLeftSumSoFar = Integer.MIN_VALUE;
        int curLeftSum = 0;

        for (int i = p; i > left - 1; i--) {
            curLeftSum += nums[i];
            curLeftSumSoFar = Math.max(curLeftSum, curLeftSumSoFar);
        }


        int curRightSumSoFar = Integer.MIN_VALUE;
        int curRightSum = 0;

        for (int i = p + 1; i < right + 1; i++) {
            curRightSum += nums[i];
            curRightSumSoFar = Math.max(curRightSum, curRightSumSoFar);
        }

        return curLeftSumSoFar + curRightSumSoFar;


    }


}
