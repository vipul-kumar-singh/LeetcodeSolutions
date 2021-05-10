package com.vkstech.leetcode.algorithms.easy;

public class CountConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        int[] arr = new int[128];
        for (char allowedChar : allowed.toCharArray()) {
            arr[allowedChar] = 1;
        }

        outer:
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (arr[c] == 0) {
                    continue outer;
                }
            }
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
