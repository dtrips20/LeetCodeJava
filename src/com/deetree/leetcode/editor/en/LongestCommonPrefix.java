package com.deetree.leetcode.editor.en;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
==================================================
Input: ["flower","flow","flight"]
Output: "fl"


Example 2:
==================================================
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */


public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str = {"flower", "flow", "flight"};
        LongestCommonPrefix pre = new LongestCommonPrefix();
        System.out.println(pre.longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        String lcp = "";

        if (strs.length == 0)
            return "";

        String firstWord = strs[0];
        int index = 0;
        for (char c : firstWord.toCharArray()) {
            for (int i = 1; i <= strs.length - 1; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {

                    return lcp;
                }
            }

            index++;
            lcp += c;
        }
        return lcp;
    }
}
