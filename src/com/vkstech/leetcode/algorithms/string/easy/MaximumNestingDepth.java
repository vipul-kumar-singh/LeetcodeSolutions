package com.vkstech.leetcode.algorithms.string.easy;

public class MaximumNestingDepth {

    public static int maxDepth(String s) {
        int count = 0;
        int highest = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                highest = Math.max(highest, ++count);
            else if (c == ')')
                count--;
        }
        return highest;
    }

    public static void main(String[] args) {
        String input = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth((input)));
    }
}
