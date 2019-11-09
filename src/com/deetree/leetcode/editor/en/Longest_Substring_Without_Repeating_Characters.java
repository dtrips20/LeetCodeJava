/*
Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

Example 1:
=============================
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
=============================
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
=============================
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package com.deetree.leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        Longest_Substring_Without_Repeating_Characters l = new Longest_Substring_Without_Repeating_Characters();
        //System.out.println(l.LengthOftheLongestString_Brute_Force("abcabcbb"));
        System.out.println(l.lengthOfLongestSubstring_Sliding_Window_optimized("abcabcbb"));
    }


    //Brute - Force method
    //Time complexity O(n3)
    //space complexity O(k) where k is the size of the set to maintain.
    public int LengthOftheLongestString_Brute_Force(String str) {
        int len = str.length();
        int ans = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (allunique(str, i, j))
                    ans = Math.max(ans, j - i);
            }
        }

        return ans;

    }

    public boolean allunique(String str, int start, int end) {
        Set<Character> set = new HashSet<>();

        for (int i = start; i < end; i++) {
            Character ch = str.charAt(i);
            if (set.contains(ch))
                return false;
            else
                set.add(ch);
        }

        return true;
    }

    //Sliding window approach with time complexity of O(n)
    //Space complexity is O(k) to store the char in set.
    public int lengthOfLongestSubstring_Sliding_Window(String str) {
        int n = str.length();
        Set<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int ans = 0;

        while (i < n && j < n) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                ans = Math.max(ans, j - i);

            } else {
                set.remove(str.charAt(i++));
            }
        }
        return ans;
    }

    //Sliding window optimized.
    public int lengthOfLongestSubstring_Sliding_Window_optimized(String str) {
        int len = str.length();
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < len; j++) {
            Character ch = str.charAt(j);

            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(str.charAt(j), j + 1);
        }

        return ans;
    }
}

