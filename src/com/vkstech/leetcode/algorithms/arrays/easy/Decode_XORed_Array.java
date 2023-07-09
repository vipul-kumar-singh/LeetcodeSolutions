package com.vkstech.leetcode.algorithms.arrays.easy;

import java.util.Arrays;

public class Decode_XORed_Array {

    public static int[] decode(int[] encoded, int first) {
        int[] newArr = new int[encoded.length + 1];
        newArr[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            newArr[i + 1] = newArr[i] ^ encoded[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }
}
