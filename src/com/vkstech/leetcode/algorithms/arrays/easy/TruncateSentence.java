package com.vkstech.leetcode.algorithms.arrays.easy;

/**
 * 1816. Truncate Sentence
 */
public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        int index = 1;
        for (int i = 0; i < s.length(); i++) {
            if (k == 0) {
                break;
            }

            if (s.charAt(i) == ' ') {
                k--;
                index = i;
            }
        }

        if (k != 0) {
            return s;
        }

        return s.substring(0, index);
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String output = truncateSentence(s, k);
        System.out.println(output);
    }
}
