package com.vkstech.leetcode.algorithms.easy;

public class ToLowerCase {

    public static String toLowerCase(String str) {
        char[] lowerChars = str.toCharArray();
        for (int i = 0; i < lowerChars.length; i++) {
            if (lowerChars[i] >= 65 && lowerChars[i] <= 90) {
                lowerChars[i] += 32;
            }
        }
        return new String(lowerChars);
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(toLowerCase(input));
    }
}
