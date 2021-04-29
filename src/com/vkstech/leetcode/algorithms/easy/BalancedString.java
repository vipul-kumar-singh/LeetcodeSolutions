package com.vkstech.leetcode.algorithms.easy;

public class BalancedString {

    public static int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;
        char start = s.charAt(0);
        for (char c : s.toCharArray()) {
            count = count + (c == start ? 1 : -1);
            if (count == 0) ++result;

        }
        return result;
    }

    public static void main(String[] args) {
        String input = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(input));
    }
}
