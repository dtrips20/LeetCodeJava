 //Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times. 
//
// You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed. 
//
// 
//
// Example 1: 
//
// 
//Input: name = "alex", typed = "aaleex"
//Output: true
//Explanation: 'a' and 'e' in 'alex' were long pressed.
// 
//
// 
// Example 2: 
//
// 
//Input: name = "saeed", typed = "ssaaedd"
//Output: false
//Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
// 
//
// 
// Example 3: 
//
// 
//Input: name = "leelee", typed = "lleeelee"
//Output: true
// 
//
// 
// Example 4: 
//
// 
//Input: name = "laiden", typed = "laiden"
//Output: true
//Explanation: It's not necessary to long press any character.
// 
//
// 
// 
// 
// 
//
// Note: 
//
// 
// name.length <= 1000 
// typed.length <= 1000 
// The characters of name and typed are lowercase letters. 
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
// Related Topics Two Pointers String
  
 package com.deetree.leetcode.editor.en;
 public class LongPressedName{
     public static void main(String[] args) {
          Solution solution = new LongPressedName().new Solution();
     }
     

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isLongPressedName(String name, String typed) {

        char[] nch = name.toCharArray();
        char[] tch = typed.toCharArray();

        int cnt = 0;

        for( int i = 0 ; i < nch.length ; ++)
        {
           while( nch[i] == tch[cnt])
           {
               cnt++;
           }
           i++;
        }

        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

 }