package com.deetree.leetcode.editor.en;

public class Add_Strings {

    public static void main(String[] args) {
        Add_Strings addString = new Add_Strings();

        System.out.println(addString.addStrings("19", "19"));

    }

    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int sum = 0, carry = 0;

        while (i >= 0 || j >= 0) {
            sum = carry;

            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';

            builder.append(sum % 10);

            carry = sum / 10;

        }

        if (carry > 0)
            builder.append(carry);
        return builder.reverse().toString();

    }
}
