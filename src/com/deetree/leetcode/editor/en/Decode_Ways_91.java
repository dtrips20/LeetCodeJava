/*
91. Decode Ways
===================
Medium
===================

A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given a non-empty string containing only digits, determine the total number of ways to decode it.

Example 1:
===============
Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).


Example 2:
=============
Input: "226"
Output: 3
Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

 */

package com.deetree.leetcode.editor.en;

public class Decode_Ways_91 {
    public static void main(String[] args) {
        Decode_Ways_91 ways = new Decode_Ways_91();
        System.out.println(ways.numDecodings("226"));
    }

    // Dynamic programming .

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {
            int firstNumber = Integer.valueOf(s.substring(i - 1, i));
            int secondNumber = Integer.valueOf(s.substring(i - 2, i));

            if (firstNumber >= 1 && firstNumber <= 9) {
                dp[i] += dp[i - 1];
            }

            if (secondNumber >= 10 && secondNumber <= 26) {
                dp[i] += dp[i - 2];
            }

        }

        return dp[s.length()];
    }

}
