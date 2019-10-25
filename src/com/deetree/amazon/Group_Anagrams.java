package com.deetree.amazon;

import java.util.*;

public class Group_Anagrams {

    public static void main(String[] args) {

        Group_Anagrams anagrams = new Group_Anagrams();

        List<List<String>> result = anagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);

            String sortedString = String.valueOf(charStr);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<String>());
            }


            map.get(sortedString).add(str);


        }

        return new ArrayList<List<String>>(map.values());
    }
}
