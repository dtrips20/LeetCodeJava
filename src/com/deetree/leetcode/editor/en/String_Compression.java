package com.deetree.leetcode.editor.en;

import java.util.*;

public class String_Compression {

    public static void main(String[] args) {

        String_Compression com = new String_Compression();
        System.out.println(com.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    public int compress(char[] chars) {

        HashMap<Character, Integer> map = new HashMap<>();


        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        StringBuilder builder = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {

            builder.append(entry.getKey());
            if (entry.getValue() != 1) {
                builder.append(entry.getValue());
            }
        }

        Arrays.copyOf(builder.toString().toCharArray(),builder.toString().toCharArray().length);


        return chars.length;

    }

}
