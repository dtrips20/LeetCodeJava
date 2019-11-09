//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
// If the last word does not exist, return 0. 
//
// Note: A word is defined as a character sequence consists of non-space characters only. 
//
// Example: 
//
// 
//Input: "Hello World"
//Output: 5
// 
//
// 
// Related Topics String

package com.deetree.leetcode.editor.en;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
        solution.lengthOfLastWord("a");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {

            s = s.trim();
            if (s.length() == 0)
                return 0;

            int count = 0;
            for (int i = s.length(); i > 0; i--) {

                if (s.substring(i - 1, i).equals(" "))
                    return count;
                else
                    count++;
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}