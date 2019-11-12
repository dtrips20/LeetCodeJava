 //Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them. 
//
// We repeatedly make duplicate removals on S until we no longer can. 
//
// Return the final string after all such duplicate removals have been made. It is guaranteed the answer is unique. 
//
// 
//
// Example 1: 
//
// 
//Input: "abbaca"
//Output: "ca"
//Explanation: 
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
// 
//
// 
//
// Note: 
//
// 
// 1 <= S.length <= 20000 
// S consists only of English lowercase letters. 
// Related Topics Stack
  
 package com.deetree.leetcode.editor.en;

 import java.util.Stack;

 public class RemoveAllAdjacentDuplicatesInString{
     public static void main(String[] args) {
          Solution solution = new RemoveAllAdjacentDuplicatesInString().new Solution();
     }
     

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();

        char[] chars = S.toCharArray();

        for( char ch : chars)
        {
            if(!st.isEmpty())
            {
                if ( st.peek() == ch)
                    st.pop();
                else
                    st.push(ch);
            }

            else
                st.push(ch);

        }

        StringBuilder builder = new StringBuilder();

        while(!st.isEmpty())
        {
            builder.append(st.pop());
        }
        return builder.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

 }