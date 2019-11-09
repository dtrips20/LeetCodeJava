/*
Reverse Integer
==================================
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
==================================
Input: 123
Output: 321

Example 2:
=================================
Input: -123
Output: -321


Example 3:
==================================
Input: 120
Output: 21
Note:
Assume we are dealing with an environment
which could only store integers within the 32-bit signed integer range
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Author:Deepak T.
Date: 09/07/2019
*/
package com.deetree.leetcode.editor.en;

public class NumberReverse {

    public static void main(String[] args)
    {
      NumberReverse n = new NumberReverse();
      System.out.println(n.reverse(123));
    }

    private int reverse(int x) {
        int y = 10;
        int temp = 0;
        int result = 0;
        while (x != 0) {
            temp = x - ((x / 10) * 10);

            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && temp > 7)
                return 0;
            if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && temp < -8)
                return 0;

            result = (result * y) + temp;

            x = x / 10;

        }
       return result;
    }
}
