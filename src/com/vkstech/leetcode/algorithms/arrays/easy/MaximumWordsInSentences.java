package com.vkstech.leetcode.algorithms.arrays.easy;

public class MaximumWordsInSentences {

    public static int mostWordsFound(String[] sentences) {
        int maxLen = 0;

        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
