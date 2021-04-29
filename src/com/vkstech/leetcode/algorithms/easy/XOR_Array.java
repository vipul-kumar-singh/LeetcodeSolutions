package com.vkstech.leetcode.algorithms.easy;

public class XOR_Array {

    public static int xorOperation(int n, int start) {
        int xor = start;
        for (int i = 1; i < n; i++)
            xor = xor ^ (start + (2 * i));
        return xor;
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }
}
