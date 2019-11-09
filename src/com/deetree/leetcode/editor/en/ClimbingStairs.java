package com.deetree.leetcode.editor.en;

public class ClimbingStairs {

    public static void main(String[] args) {

        ClimbingStairs s = new ClimbingStairs();
        System.out.println(s.Climb(2));


    }

    private int Climb(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }
}
