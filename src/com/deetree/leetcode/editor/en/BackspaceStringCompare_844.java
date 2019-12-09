//Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
//
// 
// Example 1: 
//
// 
//Input: S = "ab#c", T = "ad#c"
//Output: true
//Explanation: Both S and T become "ac".
// 
//
// 
// Example 2: 
//
// 
//Input: S = "ab##", T = "c#d#"
//Output: true
//Explanation: Both S and T become "".
// 
//
// 
// Example 3: 
//
// 
//Input: S = "a##c", T = "#a#c"
//Output: true
//Explanation: Both S and T become "c".
// 
//
// 
// Example 4: 
//
// 
//Input: S = "a#c", T = "b"
//Output: false
//Explanation: S becomes "c" while T becomes "b".
// 
//
// Note: 
//
// 
// 1 <= S.length <= 200 
// 1 <= T.length <= 200 
// S and T only contain lowercase letters and '#' characters. 
// 
//
// Follow up: 
//
// 
// Can you solve it in O(N) time and O(1) space? 
// 
// 
// 
// 
// 
// Related Topics Two Pointers Stack

package com.deetree.leetcode.editor.en;

import java.util.*;

public class BackspaceStringCompare_844 {
    public static void main(String[] args) {

        Solution solution = new BackspaceStringCompare_844().new Solution();
       System.out.println(solution.backspaceCompare("y#fo##f", "y#f#o##f"));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            Stack<Character> s1 = new Stack<>();
            Stack<Character> s2 = new Stack<>();

            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == '#') {
                    if (!s1.isEmpty())
                        s1.pop();
                }
                else
                    s1.push(c);
            }


            for (int i = 0; i < T.length(); i++) {
                char c = T.charAt(i);
                if (c == '#') {
                    if (!s2.isEmpty())
                        s2.pop();
                } else
                    s2.push(c);

            }

            return s1.equals(s2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}