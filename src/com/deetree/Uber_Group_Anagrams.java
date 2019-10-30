/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */
package com.deetree;

import java.util.*;

public class Uber_Group_Anagrams {

    public static void main(String[] main) {
        Uber_Group_Anagrams ana = new Uber_Group_Anagrams();

        List<List<String>> result = ana.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] charStr = str.toCharArray();

            Arrays.sort(charStr);

            String sortedValue = String.valueOf(charStr);

            if (!map.containsKey(sortedValue))
                map.put(sortedValue, new ArrayList<>());


            map.get(sortedValue).add(str);

        }
        return new ArrayList<List<String>>(map.values());
    }
}
