package com.vkstech.leetcode.algorithms.numbers.easy;

public class NumberOfMatches {

    public static int numberOfMatches(int n) {
        int sum = 0;
        for (int i = n; i > 1; i = (int) Math.ceil(i / 2.0)) {
            sum += (i / 2);
        }
        return sum;
    }

    public static int numberOfMatches1(int n) {
        return --n;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
}
