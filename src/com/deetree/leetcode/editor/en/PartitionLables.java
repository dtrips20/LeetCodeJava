
package com.deetree.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class PartitionLables {

    public static void main(String[] main) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));

    }

    public static List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i) {

            int a = S.charAt(i) - 'a';
            last[S.charAt(i) - 'a'] = i;
        }


        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}
