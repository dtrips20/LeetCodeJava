/*
344. Reverse String
===============================

Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:
============================
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]


Example 2:
============================
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 */
package com.deetree.leetcode.editor.en;


public class Reverse_String {

    public static void main(String[] args) {

        Reverse_String str = new Reverse_String();
        str.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public void reverseString(char[] s) {

        Helper(s, 0, s.length - 1);
    }

    private void Helper(char[] S, int left, int right) {
        if (left >= right)
            return;

        char temp = S[left];
        S[left++] = S[right];
        S[right--] = temp;

        Helper(S, left, right);
    }
}
