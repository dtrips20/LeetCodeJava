package com.deetree;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber house = new HouseRobber();


        System.out.println((house.rob(new int[]{2, 1, 1, 1, 2})));

    }

    private int rob(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        nums[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1], (nums[i] + nums[i - 2]));
        }

        return nums[nums.length - 1];
    }
}
