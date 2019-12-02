/*
476. Number Complement
=====================
Easy
====================
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

Example 1:
===========================
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example 2:
===========================
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

 */
package com.deetree.leetcode.editor.en;

public class Number_Complement_476 {

    public static void main(String[] args) {

        Number_Complement_476 num = new Number_Complement_476();
        System.out.println(num.findComplement(8));
    }


    /*
     Count the number of bits in the number
     shift the bit to left by that number.
     subtract 1 from the shifted bit.
     take XOR with original number
     */
    public int findComplement(int num) {

        int number_of_bits = 0;
        int tempNum = num;
        while (num > 0) {
            number_of_bits++;
            num = num >> 1;
        }
        int result = ((1 << number_of_bits) - 1) ^ tempNum;
        return result;
    }
}
