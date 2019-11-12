 //Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order. 
//
// Example 1: 
// 
//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
// 
// 
//
// Note:
//In the string, each word is separated by single space and there will not be any extra space in the string.
// Related Topics String
  
 package com.deetree.leetcode.editor.en;


 public class ReverseWordsInAStringIii{
     public static void main(String[] args) {
          Solution solution = new ReverseWordsInAStringIii().new Solution();
     }
     

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {

        String[] splitter = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String str : splitter)
        {
            sb.append(reverse(str));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public String reverse(String str)
    {
        char[] ch = str.toCharArray();
        int low = 0 ;
        int high = ch.length-1;
        StringBuilder sb = new StringBuilder();

        while(low < high)
        {
          char temp = ch[high];
          ch[high] = ch[low];
          ch[low] = temp;
          high--;
          low++;
        }

        for(char c : ch)
        {
            sb.append(c);
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

 }