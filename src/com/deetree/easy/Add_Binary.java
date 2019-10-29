/*
67. Add Binary
=====================
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:
====================
Input: a = "11", b = "1"
Output: "100"

Example 2:
====================
Input: a = "1010", b = "1011"
Output: "10101"

 */
package com.deetree.easy;

public class Add_Binary {

    public static void main(String[] args) {
        Add_Binary add = new Add_Binary();

        String result = add.addBinary("11", "1");

        System.out.println(result);

    }

    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();


        int carry = 0, sum = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {

            sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;


        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();


    }
}
