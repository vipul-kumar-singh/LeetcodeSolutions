package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;

public class OriginalArrayOfPrefixXor {

    public static int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for (int i = pref.length - 1; i > 0; i--) {
            arr[i] = pref[i] ^ pref[i - 1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        int[] arr = findArray(pref);

        System.out.println(Arrays.toString(arr));
    }
}
