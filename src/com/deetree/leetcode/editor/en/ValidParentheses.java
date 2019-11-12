//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// Note that an empty string is also considered valid. 
//
// Example 1: 
//
// 
//Input: "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: "{[]}"
//Output: true
// 
// Related Topics String Stack

package com.deetree.leetcode.editor.en;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();

        solution.isValid("(]");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {

            HashMap<Character, Character> closeMap = new HashMap<>();
            closeMap.put('}', '{');
            closeMap.put(')', '(');
            closeMap.put(']', '[');

            Stack<Character> st = new Stack<>();

            char[] chars = s.toCharArray();

            for (char ch : chars) {
                if (closeMap.containsKey(ch) && !st.empty()) {
                    if (closeMap.get(ch) !=  st.pop())
                        return false;

                } else
                    st.push(ch);
            }


            return st.isEmpty();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}