package com.deetree.amazon.medium;

public class String_to_Integer {

    public static void main(String[] args) {
        String_to_Integer s = new String_to_Integer();
        int and = s.myAtoi("123 work");
    }


    public int myAtoi(String str) {

        str = str.trim();

        if (str.isEmpty())
            return 0;


        int i = 0, ans = 0, sign = 1, len = str.length();

        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i++) == '+' ? 1 : -1;

        }

        for (; i < len; ++i) {
            int tmp = str.charAt(i) - '0';

            if (tmp < 0 || tmp > 9) {
                break;
            }

            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < tmp) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else
                ans = ans * 10 + tmp;


        }

        return ans * sign;

    }
}
