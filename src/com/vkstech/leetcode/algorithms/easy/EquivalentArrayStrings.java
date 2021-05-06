package com.vkstech.leetcode.algorithms.easy;

public class EquivalentArrayStrings {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) sb1.append(s);
        for (String s : word2) sb2.append(s);

        return sb1.toString().equals(sb2.toString());
    }

    public static boolean arrayStringsAreEqualV2(String[] word1, String[] word2) {
        int idx1 = 0, idx2 = 0, arrIdx1 = 0, arrIdx2 = 0;
        while (arrIdx1 < word1.length && arrIdx2 < word2.length) {
            if (word1[arrIdx1].charAt(idx1) != word2[arrIdx2].charAt(idx2)) return false;
            idx1 = (++idx1) % word1[arrIdx1].length();
            idx2 = (++idx2) % word2[arrIdx2].length();
            if (idx1 == 0) arrIdx1++;
            if (idx2 == 0) arrIdx2++;
        }
        return arrIdx1 == word1.length && arrIdx2 == word2.length;
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
