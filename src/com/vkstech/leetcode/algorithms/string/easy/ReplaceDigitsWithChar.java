package com.vkstech.leetcode.algorithms.string.easy;

public class ReplaceDigitsWithChar {

    public static String replaceDigits(String s) {
        char[] res = s.toCharArray();
        for (int i = 1; i < s.length(); i += 2) {
            res[i] = shift(res[i - 1], Character.getNumericValue(res[i]));
        }
        return String.valueOf(res);
    }

    public static char shift(char c, int x) {
        return (char) (c + x);
    }

    public static void main(String[] args) {
        String input = "a1c1e1z1";
        System.out.println(replaceDigits(input));
    }
}
