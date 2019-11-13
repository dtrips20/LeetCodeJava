 //Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions. 
//
// 
//
// 
// 
// 
// 
// 
// 
// 
// 
//
// 
// Example 1: 
//
// 
//Input: "ab-cd"
//Output: "dc-ba"
// 
//
// 
// Example 2: 
//
// 
//Input: "a-bC-dEf-ghIj"
//Output: "j-Ih-gfE-dCba"
// 
//
// 
// Example 3: 
//
// 
//Input: "Test1ng-Leet=code-Q!"
//Output: "Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 
// Note: 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S doesn't contain \ or " 
// 
// 
// 
// 
// Related Topics String
  
 package com.deetree.leetcode.editor.en;


 import java.util.Stack;

 public class ReverseOnlyLetters{
     public static void main(String[] args) {
          Solution solution = new ReverseOnlyLetters().new Solution();
     }
     

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String S) {

        Stack<Character> st = new Stack<>();

        for( char ch : S.toCharArray())
        {
            if (Character.isLetter(ch))
            {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : S.toCharArray())
        {
            if ( Character.isLetter(ch))
                sb.append(st.pop());
            else
                sb.append(ch);
        }

        return sb.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

 }