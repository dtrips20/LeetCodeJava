/*
387. First Unique Character in a String
=======================================
easy
=======================================

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:
================
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

Time Complexity: O(N) because only 2 constant loops running for N times.
Space complexity: O(1) because at most there will 26 character to be maintained by hash map.

 */
package com.deetree.leetcode.editor.en;

import java.util.HashMap;

public class First_Unique_Character_in_a_String {

    public static void main(String[] args) {

        First_Unique_Character_in_a_String u = new First_Unique_Character_in_a_String();
        int result = u.firstUniqChar("loveleetcode");
        System.out.println("Index of First Unique Character in a String: " + result);

    }

    public int firstUniqChar(String s) {


        char[] ch = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i <= ch.length - 1; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }

        for (int i = 0; i <= ch.length - 1; i++) {

            if (map.get(ch[i]) == 1)
                return i;
        }


        return -1;


    }
}
