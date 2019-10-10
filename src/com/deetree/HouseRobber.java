package com.deetree;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber house = new HouseRobber();
        System.out.println((house.rob(new int[]{2, 1, 1, 1, 2})));

    }

    private int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;

        int even = 0;
        int odd = 0;

        for (int x = 0; x <= num.length - 1; x++) {
            if (x % 2 == 0) {
                even = Math.max(even + num[x], odd);
            } else {
                odd = Math.max(odd + num[x], even);
            }


            //int temp = currMax;
            //currMax = Math.max(prevMax + num[x], currMax);
            //prevMax = temp;
        }
        return Math.max(even, odd);        //return currMax;
    }
}
