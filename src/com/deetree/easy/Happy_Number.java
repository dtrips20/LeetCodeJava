/*
202. Happy Number
=============================

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number
equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.

Example:
===============================
Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 02 = 1

 */
package com.deetree.easy;

import java.util.LinkedList;
import java.util.List;

public class Happy_Number {

    public static void main(String[] main) {
        Happy_Number happy = new Happy_Number();

        boolean i = happy.isHappy(19);

        System.out.println(i);

    }

    private boolean isHappy(int n) {
        List<Integer> seenBefore = new LinkedList<>();
        while (n > 1) {
            if (!seenBefore.contains(n))
                seenBefore.add(n);
            else
                return false;

            n = helper(n);
        }
        return (n == 1);
    }

    private int helper(int n) {
        if (n == 0)
            return 0;

        int i = n % 10;
        return (i * i + helper(n / 10));
    }
}
