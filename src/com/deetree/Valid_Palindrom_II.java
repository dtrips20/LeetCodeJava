
/*
680. Valid Palindrome II
========================

Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
==========
Input: "aba"
Output: True

Example 2:
===========
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000. */

package com.deetree;

public class Valid_Palindrom_II {

    public static void main(String[] args) {
        Valid_Palindrom_II v = new Valid_Palindrom_II();
        System.out.println(v.validPalindrome("cbbcc"));

    }

    boolean done = false;

    public boolean validPalindrome(String s) {

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                if (!done) {
                    done = true;
                    return validPalindrome(s.substring(0, low) + s.substring(low + 1));
                }

                return false;
            }

        }

        return true;

    }

}
