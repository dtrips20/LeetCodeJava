/*
20. Valid Parentheses
===================================
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
======================
Input: "()"
Output: true

Example 2:
=====================
Input: "()[]{}"
Output: true

Example 3:
=====================
Input: "(]"
Output: false

Example 4:
====================
Input: "([)]"
Output: false

Example 5:
====================
Input: "{[]}"
Output: true

 */

package com.deetree.misc;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {

    public static void main(String[] args) {
        Valid_Parentheses par = new Valid_Parentheses();
        System.out.println(par.isValid("()[]{}"));
    }

    private boolean isValid(String s) {

        Map<Character, Character> closing = new HashMap<>();
        closing.put(')', '(');
        closing.put('}', '{');
        closing.put(']', '[');


        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (closing.containsKey(c) && !stack.isEmpty()) {
                char poped = stack.pop();
                if (poped != closing.get(c))
                    return false;
            } else
                stack.push(c);

        }

        return stack.isEmpty();

    }


}
