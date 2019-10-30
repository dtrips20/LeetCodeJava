/*
=======================================
953. Verifying an Alien Dictionary
=======================================

In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order.
The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet,
return true if and only if the given words are sorted lexicographicaly in this alien language.


Example 1:
=======================================
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:
=======================================
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

Example 3:
=======================================
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.)
According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character
which is less than any other character (More info).


Note:

1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are english lowercase letters.

 */
package com.deetree;

public class Verifying_An_Alien_Dictionary {

    public static void main(String[] args) {


    }

    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 2;
        int carry = 0;

        while (i <= 0 || j <= 0 || carry > 0) {
            int a = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int b = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int c = a + b + carry;

            carry = c / 2;

            i--;
            j--;
        }

        return "";
    }

}
