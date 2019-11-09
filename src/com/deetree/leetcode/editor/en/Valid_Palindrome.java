/*
125. Valid Palindrome
==================================
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
=================================
Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

 */
package com.deetree.leetcode.editor.en;

public class Valid_Palindrome {

    public static void main(String[] args) {
        Valid_Palindrome pali = new Valid_Palindrome();

        System.out.println(pali.isPalindrome("A man, a plan, a canal: Panama"));
    }


    public boolean isPalindrome(String s) {

        //This is a important line.
        s = s.replaceAll("[^A-Za-z0-9]", "");

        if (s.length() == 0)
            return true;

        char[] charArray = s.toCharArray();
        int low = 0;
        int high = charArray.length - 1;

        while (low < high) {
            if (!String.valueOf(charArray[high]).toLowerCase().equals(String.valueOf(charArray[low]).toLowerCase())) {
                return false;
            } else {
                low++;
                high--;
            }

        }
        return true;
    }
}
