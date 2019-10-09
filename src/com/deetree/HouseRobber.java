package com.deetree;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber house = new HouseRobber();
        System.out.println((house.rob(new int[]{2, 1, 1, 2})));

    }

    private int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x = 0; x <= num.length - 1; x++) {
            int temp = currMax;
            currMax = Math.max(prevMax + num[x], currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
