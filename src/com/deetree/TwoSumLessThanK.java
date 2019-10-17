package com.deetree;
/*
Given an array A of integers and integer K, return the maximum S
such that there exists i < j with A[i] + A[j] = S and S < K. If no i, j exist satisfying this equation, return -1.


Example 1:
==========================================
Input: A = [34,23,1,24,75,33,54,8], K = 60
Output: 58
Explanation:
We can use 34 and 24 to sum 58 which is less than 60.


Example 2:
=======================================
Input: A = [10,20,30], K = 15
Output: -1
Explanation:
In this case it's not possible to get a pair sum less that 15.


Note:

1 <= A.length <= 100
1 <= A[i] <= 1000
1 <= K <= 2000
 */

import java.util.Arrays;

public class TwoSumLessThanK {

    public static void main(String[] args) {

        TwoSumLessThanK Two = new TwoSumLessThanK();
        System.out.println(Two.twoSumLessThanK(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60));
    }

    public int twoSumLessThanK(int[] A, int K) {

        Arrays.sort(A);
        int min = -1;
        int i = 0;
        int j = A.length - 1;

        while (i < j) {
            int sum = A[i] + A[j];
            if (sum < K) {
                i++;
                min = Math.max(min, sum);
            } else {
                j--;
            }
        }
        return min;
    }
}
