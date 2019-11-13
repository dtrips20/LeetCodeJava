//Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words. It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
//
// Words in the list of banned words are given in lowercase, and free of punctuation. Words in the paragraph are not case sensitive. The answer is in lowercase. 
//
// 
//
// Example: 
//
// 
//Input: 
//paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
//banned = ["hit"]
//Output: "ball"
//Explanation: 
//"hit" occurs 3 times, but it is a banned word.
//"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
//Note that words in the paragraph are not case sensitive,
//that punctuation is ignored (even if adjacent to words, such as "ball,"), 
//and that "hit" isn't the answer even though it occurs more because it is banned.
// 
//
// 
//
// Note: 
//
// 
// 1 <= paragraph.length <= 1000. 
// 0 <= banned.length <= 100. 
// 1 <= banned[i].length <= 10. 
// The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.) 
// paragraph only consists of letters, spaces, or the punctuation symbols !?',;. 
// There are no hyphens or hyphenated words. 
// Words only consist of letters, never apostrophes or other punctuation symbols. 
// 
// Related Topics String

package com.deetree.leetcode.editor.en;


import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        Solution solution = new MostCommonWord().new Solution();
        solution.mostCommonWord("Bob", new String[]{""});
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {

            paragraph += ".";
            Map<String, Integer> map = new HashMap<>();

            HashSet<String> bannedSet = new HashSet<>();

            String[] parray = paragraph.split(" ");

            int ansCount = 0;
            String ans = "";
            for (String b : banned) {
                if (!bannedSet.contains(b))
                    bannedSet.add(b.toLowerCase());
            }
            StringBuilder wordBuilder = new StringBuilder();
            for (char letter : paragraph.toCharArray()) {
                if (Character.isLetter(letter))
                    wordBuilder.append(letter);

                else if (wordBuilder.length() > 0) {
                    String finalWord = wordBuilder.toString().toLowerCase();
                        if (!bannedSet.contains(finalWord)) {
                            map.put(finalWord, map.getOrDefault(finalWord, 0) + 1);

                            if (map.get(finalWord) > ansCount) {
                                ans = finalWord;
                                ansCount = map.get(finalWord);
                            }
                        }
                    wordBuilder = new StringBuilder();

                }


            }

            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}