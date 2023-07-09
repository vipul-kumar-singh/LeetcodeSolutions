package com.vkstech.leetcode.algorithms.string.easy;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        for (char j : jewels.toCharArray()) {
            for (char s : stones.toCharArray()) {
                if (j == s)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
