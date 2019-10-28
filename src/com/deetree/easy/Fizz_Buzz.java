/*
412. Fizz Buzz
====================

Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
 */
package com.deetree.easy;

import java.util.LinkedList;
import java.util.List;

public class Fizz_Buzz {

    public static void main(String[] args) {

        Fizz_Buzz f = new Fizz_Buzz();
        List<String> result = f.fizzBuzz(15);

        for (String s : result) {
            System.out.println(s);
        }

    }

    public List<String> fizzBuzz(int n) {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        List<String> result = new LinkedList<>();


        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.add(Fizz + Buzz);
            } else if (i % 5 == 0) {
                result.add(Buzz);
            } else if (i % 3 == 0) {
                result.add(Fizz);
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
