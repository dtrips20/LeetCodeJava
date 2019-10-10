package com.deetree;

public class GCD {

    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 0 % 2;

        int arr[] = {40, 20, 80};
        int n = arr.length;
        System.out.println(findGCD(arr, n));


    }

    static int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
