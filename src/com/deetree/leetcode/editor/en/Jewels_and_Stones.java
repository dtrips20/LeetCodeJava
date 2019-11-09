/*
771. Jewels and Stones
======================
Easy
============

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

 */
package com.deetree.leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

public class Jewels_and_Stones {

    public static void main(String[] args) {
        Jewels_and_Stones j = new Jewels_and_Stones();
        System.out.println(j.numJewelsInStones("aA", "aAAbbbb"));
    }

    /*
    Complexity Analysis

    Time Complexity: O(j.length + s.length)

     Space Complexity: O(J.length) because we are storing it in set.
     */
    public int numJewelsInStones(String J, String S) {

        Set<Character> j = new HashSet<>();
        int count = 0;
        for (int i = 0; i <= J.length() - 1; i++) {
            j.add(J.charAt(i));
        }

        for (int i = 0; i <= S.length() - 1; i++) {
            if (j.contains(S.charAt(i))) {
                count++;
            }


        }

        return count;


    }
}

